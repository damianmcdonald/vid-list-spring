// global variable declarations
var MAX_SCROLLABLE = 300;
var INFO_URL_MOVIE = "https://www.themoviedb.org/movie/";
var INFO_URL_TV = "https://www.themoviedb.org/tv/";
var POSTER_PATH = "http://image.tmdb.org/t/p/w342/";
var CONTENT_DATA = [];

$( document ).ready(function() {

    // add scroll logic so that when the screen has been scrolled past
    // MAX_SCROLLABLE we can show a 'back to top' button
    $(window).scroll(function() {
        if ( $(window).scrollTop() > MAX_SCROLLABLE ) {
            $('a.back-to-top').show();
        } else {
            $('a.back-to-top').hide();
        }
    });

    // animate the back-to-top effect
    $('a.back-to-top').click(function() {
        $('html, body').animate({
            scrollTop: 0
        }, 700);
        return false;
    });


	// animate the back-to-top effect
	$('#category-movie').click(function() {
		clearArray(CONTENT_DATA);
		getVideos("MOVIE");
		return false;
	});

	$('#category-tvshow').click(function() {
		clearArray(CONTENT_DATA);
		getVideos("TV_SHOW");
		return false;
	});

	$('#category-documentary').click(function() {
		clearArray(CONTENT_DATA);
		getVideos("DOCUMENTARY");
		return false;
	});

});

function getVideos(category) {
	console.log("Calling getVideos");
	$.ajax( '/video/'+category, {
		dataType:'json',
		data:{},
		type:'GET',
		success:function ( data ) {
			console.log(data);
			$.each(data, function( index, video ) {
				addContentElement(video);
			});
			renderGrid();
		}
	})
	.error( function() {
		console.log("error");
	});
}

function addContentElement(video) {
	if(video.movie_results.length > 0) {
		CONTENT_DATA.push(
			{
				"poster": POSTER_PATH+video.movie_results[0].poster_path,
				"title": video.movie_results[0].original_title,
				"plot": video.movie_results[0].overview,
				"rating": video.movie_results[0].vote_average,
				"release": video.movie_results[0].release_date,
				"type": "Movie",
				"info": INFO_URL_MOVIE+video.movie_results[0].id
			}
		);
	} else if(video.tv_results.length > 0) {
		CONTENT_DATA.push(
			{
				"poster": POSTER_PATH+video.tv_results[0].poster_path,
				"title": video.tv_results[0].original_name,
				"plot": video.tv_results[0].overview,
				"rating": video.tv_results[0].vote_average,
				"release": video.tv_results[0].first_air_date,
				"type": "TV Show",
				"info": INFO_URL_TV+video.tv_results[0].id
			}
		);
	}
}

function renderGrid() {
	var html = '';

	CONTENT_DATA.sort(function(a, b){return b.rating-a.rating});

	$.each(CONTENT_DATA, function( index, content ) {
		html += generateContentElement(content);
	});

	$('.grid').html(html);
}

function generateContentElement(content) {
	var html = '';
	html += '<div class="element-item">';
	html += '<div class="card hoverable">';
	html += '<div class="card-image">';
	html += '<img class="activator responsive-img" src="' + content.poster + '">';

	html += '</div>'; // close of .card-image
	html += '<div class="card-content">';
	html += '<div class="reveal-link">';
	html += '<span class="card-title activator grey-text text-darken-4"><i class="material-icons right">more_vert</i></span>';
	html += '</div>'; // close of .reveal-link
	html += '</div>'; // close of .card-content
	html += '<div class="card-reveal" style="font-size: 12px;">';
	html += '<span class="card-title grey-text text-darken-4">Details<i class="material-icons right">close</i></span>';
	html += '<p>' + content.plot + '</p>';
	html += '<table class="striped">';
	html += '<tr><td><b>Title</b></td><td>' + content.title + '</td></tr>';
	html += '<tr><td><b>Release Date</b></td><td>' + content.release + '</td></tr>';
	html += '<tr><td><b>Type</b></td><td>' + content.type + '</td></tr>';
	html += '<tr><td><b>IMDB Score</b></td><td>' + content.rating + '</td></tr>';
	html += '<tr><td><b>More Info</b></td><td><a href="' + content.info + '" target="_blank">The Movie DB</a></td></tr>';
	html += '</table>';

	html += '</div>'; // close of .card-reveal
	html += '</div>'; // close of .card
	html += '</div>'; // close of .element-item
	return html;
}

function clearArray(arr) {
	arr.length = 0;
}
