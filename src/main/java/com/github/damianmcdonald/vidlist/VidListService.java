package com.github.damianmcdonald.vidlist;

import org.springframework.stereotype.Component;

@Component
public class VidListService {

    protected String getVideoData(final String category) {
        String jsonData;
        switch (category) {
            case "MOVIE":
                jsonData = JSON_MOVIE_DATA;
                break;
            case "TV_SHOW":
                jsonData = JSON_TV_SHOW_DATA;
                break;
            case "DOCUMENTARY":
                jsonData = JSON_DOCUMENTARY_DATA;
                break;
            default:
                throw new RuntimeException("Invalid category: " + category);

        }
        return jsonData;
    }

    private final static String JSON_MOVIE_DATA = "[\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/dHDQ0PhyH6B21OPYqApndkni2B6.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               27,\n" +
            "               9648,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"id\":297608,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Taking of Deborah Logan\",\n" +
            "            \"overview\":\"What starts as a poignant medical documentary about Deborah Logan's descent into Alzheimer's disease and her daughter's struggles as caregiver degenerates into a maddening portrayal of dementia at its most frightening, as hair-raising events begin to plague the family and crew and an unspeakable malevolence threatens to tear the very fabric of sanity from them all.\",\n" +
            "            \"poster_path\":\"/lVHsBxkEXSH25TaUfyYF4KfrhlB.jpg\",\n" +
            "            \"release_date\":\"2014-10-21\",\n" +
            "            \"title\":\"The Taking of Deborah Logan\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.0,\n" +
            "            \"vote_count\":378\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/zXwFJMwvQcJFitP9GcHZvHAHGe8.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               36\n" +
            "            ],\n" +
            "            \"id\":399404,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Darkest Hour\",\n" +
            "            \"overview\":\"A thrilling and inspiring true story begins on the eve of World War II as, within days of becoming Prime Minister of Great Britain, Winston Churchill must face one of his most turbulent and defining trials: exploring a negotiated peace treaty with Nazi Germany, or standing firm to fight for the ideals, liberty and freedom of a nation. As the unstoppable Nazi forces roll across Western Europe and the threat of invasion is imminent, and with an unprepared public, a skeptical King, and his own party plotting against him, Churchill must withstand his darkest hour, rally a nation, and attempt to change the course of world history.\",\n" +
            "            \"poster_path\":\"/xa6G3aKlysQeVg9wOb0dRcIGlWu.jpg\",\n" +
            "            \"release_date\":\"2017-11-22\",\n" +
            "            \"title\":\"Darkest Hour\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":7.1,\n" +
            "            \"vote_count\":732\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/2J283YNxKhxAqHeVegUJ5mzLfGb.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               9648\n" +
            "            ],\n" +
            "            \"id\":392044,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Murder on the Orient Express\",\n" +
            "            \"overview\":\"Genius Belgian detective Hercule Poirot investigates the murder of an American tycoon aboard the Orient Express train.\",\n" +
            "            \"poster_path\":\"/iBlfxlw8qwtUS0R8YjIU7JtM6LM.jpg\",\n" +
            "            \"release_date\":\"2017-11-03\",\n" +
            "            \"title\":\"Murder on the Orient Express\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.7,\n" +
            "            \"vote_count\":1803\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":422129,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":0,\n" +
            "            \"vote_average\":0.0,\n" +
            "            \"title\":\"The Neighbor\",\n" +
            "            \"release_date\":\"2017-06-19\",\n" +
            "            \"original_language\":\"es\",\n" +
            "            \"original_title\":\"El Vecino\",\n" +
            "            \"genre_ids\":[\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":null,\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Improvised film about an ex-kidnapper trying to fit back into 'normal' society but he finds himself repeating the same patterns from his past of observation and monitoring with his next door neighbors.\",\n" +
            "            \"poster_path\":\"/agfhEDbuwPFNYVzTkFdtZ8yO9IB.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":374720,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":4858,\n" +
            "            \"vote_average\":7.4,\n" +
            "            \"title\":\"Dunkirk\",\n" +
            "            \"release_date\":\"2017-07-19\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Dunkirk\",\n" +
            "            \"genre_ids\":[\n" +
            "               28,\n" +
            "               18,\n" +
            "               36,\n" +
            "               53,\n" +
            "               10752\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/4yjJNAgXBmzxpS6sogj4ftwd270.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"The story of the miraculous evacuation of Allied soldiers from Belgium, Britain, Canada and France, who were cut off and surrounded by the German army from the beaches and harbour of Dunkirk between May 26th and June 4th 1940 during World War II.\",\n" +
            "            \"poster_path\":\"/ebSnODDg9lbsMIaWg2uAbjn7TO5.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":346364,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":6590,\n" +
            "            \"vote_average\":7.1,\n" +
            "            \"title\":\"It\",\n" +
            "            \"release_date\":\"2017-09-05\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"It\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               27,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.\",\n" +
            "            \"poster_path\":\"/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/jPPuIwZ4r6eWH5y1CzvuTdla50x.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               27\n" +
            "            ],\n" +
            "            \"id\":433808,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Ritual\",\n" +
            "            \"overview\":\"A group of college friends reunite for a trip to the forest, but encounter a menacing presence in the woods that's stalking them.\",\n" +
            "            \"poster_path\":\"/hHuJqzby593lmYmw1SzT0XYy99t.jpg\",\n" +
            "            \"release_date\":\"2017-10-11\",\n" +
            "            \"title\":\"The Ritual\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.2,\n" +
            "            \"vote_count\":139\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/mVr0UiqyltcfqxbAUcLl9zWL8ah.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               9648,\n" +
            "               878,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"id\":335984,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Blade Runner 2049\",\n" +
            "            \"overview\":\"Thirty years after the events of the first film, a new blade runner, LAPD Officer K, unearths a long-buried secret that has the potential to plunge what's left of society into chaos. K's discovery leads him on a quest to find Rick Deckard, a former LAPD blade runner who has been missing for 30 years.\",\n" +
            "            \"poster_path\":\"/gajva2L0rPYkEWjzgFlBXCAVBE5.jpg\",\n" +
            "            \"release_date\":\"2017-10-04\",\n" +
            "            \"title\":\"Blade Runner 2049\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":7.4,\n" +
            "            \"vote_count\":3266\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":400617,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":153,\n" +
            "            \"vote_average\":7.3,\n" +
            "            \"title\":\"Phantom Thread\",\n" +
            "            \"release_date\":\"2017-12-25\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Phantom Thread\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               10749\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/9boWmnVNyUHkoWHyzchOv6rs8w0.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"In the glamour of 1950s post-war London, renowned dressmaker Reynolds Woodcock and his sister Cyril are at the center of British fashion. Women come and go through Woodcock’s life, providing the confirmed bachelor with inspiration and companionship, until he comes across a young, strong-willed woman, Alma, who soon becomes a fixture in his life as his muse and lover. Once controlled and planned, he finds his carefully tailored life disrupted by love.\",\n" +
            "            \"poster_path\":\"/yZ8j8xKk2xQ1d88hB8YG6LZfRQj.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":330764,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":490,\n" +
            "            \"vote_average\":6.5,\n" +
            "            \"title\":\"The Brand New Testament\",\n" +
            "            \"release_date\":\"2015-09-02\",\n" +
            "            \"original_language\":\"fr\",\n" +
            "            \"original_title\":\"Le tout nouveau testament\",\n" +
            "            \"genre_ids\":[\n" +
            "               35,\n" +
            "               18,\n" +
            "               14\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/b88qNTQROeZ5BQxGdOHrV8rPn5e.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"God lives in Brussels. On earth though, God is a coward, with pathetical morals and being odious with his family. His daughter, Ea, is bored at home and can't stand being locked up in a small apartment in ordinary Brussels, until the day she decides to revolt against her dad...\",\n" +
            "            \"poster_path\":\"/pTVnOaZTxdCFFgdrl1tgXdoYYXH.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/kt2hK5trzPOw0T53E9dNqBPSQPJ.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               35,\n" +
            "               80,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"id\":8321,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"In Bruges\",\n" +
            "            \"overview\":\"Ray and Ken, two hit men, are in Bruges, Belgium, waiting for their next mission. While they are there they have time to think and discuss their previous assignment. When the mission is revealed to Ken, it is not what he expected.\",\n" +
            "            \"poster_path\":\"/kBABboeLU2HsKWSG7DwiF9saHl5.jpg\",\n" +
            "            \"release_date\":\"2008-02-08\",\n" +
            "            \"title\":\"In Bruges\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":7.4,\n" +
            "            \"vote_count\":1681\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":384521,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":472,\n" +
            "            \"vote_average\":5.9,\n" +
            "            \"title\":\"The Cloverfield Paradox\",\n" +
            "            \"release_date\":\"2018-02-04\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Cloverfield Paradox\",\n" +
            "            \"genre_ids\":[\n" +
            "               27,\n" +
            "               9648,\n" +
            "               878,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/2cnUCcNmmj79hGmimvWlUo5P2K8.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Orbiting above a planet on the brink of war, scientists test a device to solve an energy crisis and end up face-to-face with a dark alternate reality.\",\n" +
            "            \"poster_path\":\"/gfxPTyeG9HescyS3EAcMM0VxNg6.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/7mgKeg18Qml5nJQa56RBZO7dIu0.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               28,\n" +
            "               878\n" +
            "            ],\n" +
            "            \"id\":137113,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Edge of Tomorrow\",\n" +
            "            \"overview\":\"Major Bill Cage is an officer who has never seen a day of combat when he is unceremoniously demoted and dropped into combat. Cage is killed within minutes, managing to take an alpha alien down with him. He awakens back at the beginning of the same day and is forced to fight and die again... and again - as physical contact with the alien has thrown him into a time loop.\",\n" +
            "            \"poster_path\":\"/tpoVEYvm6qcXueZrQYJNRLXL88s.jpg\",\n" +
            "            \"release_date\":\"2014-05-27\",\n" +
            "            \"title\":\"Edge of Tomorrow\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":7.6,\n" +
            "            \"vote_count\":5777\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/X8ExoREJv55ePIWRUqUrQXbLAN.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               28,\n" +
            "               80,\n" +
            "               14\n" +
            "            ],\n" +
            "            \"id\":400106,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Bright\",\n" +
            "            \"overview\":\"In an alternate present-day where magical creatures live among us, two L.A. cops become embroiled in a prophesied turf battle.\",\n" +
            "            \"poster_path\":\"/whkT53Sv2vKAUiknQ13pqcWaPXB.jpg\",\n" +
            "            \"release_date\":\"2017-12-22\",\n" +
            "            \"title\":\"Bright\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.3,\n" +
            "            \"vote_count\":1415\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/sDiGcjWhSu42dCw0jQmBInAkDZ9.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               28,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"id\":379149,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Foreigner\",\n" +
            "            \"overview\":\"Quan is a humble London businessman whose long-buried past erupts in a revenge-fueled vendetta when the only person left for him to love – his teenage daughter – dies in a senseless act of politically-motivated terrorism. His relentless search to find the terrorists leads to a cat-and-mouse conflict with a British government official whose own past may hold the clues to the identities of the elusive killers.\",\n" +
            "            \"poster_path\":\"/rwM4hzrmc5HiWfQD9ls9DL4QgGl.jpg\",\n" +
            "            \"release_date\":\"2017-09-28\",\n" +
            "            \"title\":\"The Foreigner\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.9,\n" +
            "            \"vote_count\":408\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/w1ER1Sf57M9QTU2pOEdP5cHeCxD.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               878\n" +
            "            ],\n" +
            "            \"id\":426254,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Marjorie Prime\",\n" +
            "            \"overview\":\"A service which creates holographic projections of late family members allows an elderly woman to spend time with a younger version of her deceased husband.\",\n" +
            "            \"poster_path\":\"/rvTZFjcNvzPFYJnmdrvSrGvqx67.jpg\",\n" +
            "            \"release_date\":\"2017-08-18\",\n" +
            "            \"title\":\"Marjorie Prime\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.2,\n" +
            "            \"vote_count\":38\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":452507,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":432,\n" +
            "            \"vote_average\":6.1,\n" +
            "            \"title\":\"1922\",\n" +
            "            \"release_date\":\"2017-10-20\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"1922\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               27,\n" +
            "               9648,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/3uwyXMZN93PRkShUxvLrufwVAc2.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A simple yet proud rancher conspires to murder his wife for financial gain, convincing his teenage son to participate.\",\n" +
            "            \"poster_path\":\"/q4FQOiSRhTLWulHl5Vpg37FMArH.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/d6NHilDfaYgkyqEvP9KEvhxx9o9.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               878\n" +
            "            ],\n" +
            "            \"id\":429101,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Anti Matter\",\n" +
            "            \"overview\":\"Anti Matter (AKA Worm) is a sci-fi noir take on the Alice in Wonderland tale. Ana, an Oxford PhD student, finds herself unable to build new memories following an experiment to generate and travel through a wormhole. The story follows her increasingly desperate efforts to understand what happened, and to find out who - or what - is behind the rising horror in her life.\",\n" +
            "            \"poster_path\":\"/fQq24L8ioUy3cHWPo8LheguicxF.jpg\",\n" +
            "            \"release_date\":\"2016-09-26\",\n" +
            "            \"title\":\"Anti Matter\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.4,\n" +
            "            \"vote_count\":32\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":310133,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":298,\n" +
            "            \"vote_average\":5.7,\n" +
            "            \"title\":\"Cop Car\",\n" +
            "            \"release_date\":\"2015-08-07\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Cop Car\",\n" +
            "            \"genre_ids\":[\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/mtBguy4PRzFZ0xQC6VoYz7Knmef.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Two kids find themselves in the centre of a deadly game of cat and mouse after taking a sheriff's cruiser for a joy ride.\",\n" +
            "            \"poster_path\":\"/6LTj0CJhpOFISrpHJQD0aUILnFS.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/ynJO5IHwgrLjBFDGkvBV8vKAvGe.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               9648\n" +
            "            ],\n" +
            "            \"id\":419835,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Crooked House\",\n" +
            "            \"overview\":\"A private investigator helps a former flame solve the murder of her wealthy grandfather, who lived in a sprawling estate surrounded by his idiosyncratic family.\",\n" +
            "            \"poster_path\":\"/n3Nwj7WrV42osuILi4ErBCoqkQl.jpg\",\n" +
            "            \"release_date\":\"2017-09-14\",\n" +
            "            \"title\":\"Crooked House\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.5,\n" +
            "            \"vote_count\":110\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":6145,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":951,\n" +
            "            \"vote_average\":7.2,\n" +
            "            \"title\":\"Fracture\",\n" +
            "            \"release_date\":\"2007-04-20\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Fracture\",\n" +
            "            \"genre_ids\":[\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/rf5j1avHtvLkVnBLdGmqh1LbIN0.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A husband is on trial for the attempted murder of his wife, in what is seemingly an open/shut case for the ambitious district attorney trying to put him away. However, there are surprises for both around every corner, and, as a suspenseful game of cat-and-mouse is played out, each must manipulate and outwit the other.\",\n" +
            "            \"poster_path\":\"/z8dmpPvIybKIlSuzPnt0TQmrYxd.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":323368,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":19,\n" +
            "            \"vote_average\":5.9,\n" +
            "            \"title\":\"Hangman\",\n" +
            "            \"release_date\":\"2017-12-22\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Hangman\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               9648,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/mgKO8vKaEuXdqMc0Ftm28Q2Hpzt.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A homicide detective teams up with a criminal profiler to catch a serial killer whose crimes are inspired by the children's game, Hangman.\",\n" +
            "            \"poster_path\":\"/cf720YwBmp0roCVfBWjGXoWzZ6C.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/jaQe5U0CTjk0h3stMrkZG9qnSVh.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               27,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"id\":418078,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"It Comes at Night\",\n" +
            "            \"overview\":\"Secure within a desolate home as an unnatural threat terrorizes the world, a man has established a tenuous domestic order with his wife and son, but this will soon be put to test when a desperate young family arrives seeking refuge.\",\n" +
            "            \"poster_path\":\"/h9VOirT4dKXzVyVzZZxPfAghmRV.jpg\",\n" +
            "            \"release_date\":\"2017-06-09\",\n" +
            "            \"title\":\"It Comes at Night\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":5.7,\n" +
            "            \"vote_count\":621\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":392011,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":34,\n" +
            "            \"vote_average\":7.5,\n" +
            "            \"title\":\"Kedi\",\n" +
            "            \"release_date\":\"2017-02-10\",\n" +
            "            \"original_language\":\"tr\",\n" +
            "            \"original_title\":\"Kedi\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/7Ak9VJ67NEKuUmnVlDjGWWHSnB7.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A profile of an ancient city and its unique people, seen through the eyes of the most mysterious and beloved animal humans have ever known, the Cat.\",\n" +
            "            \"poster_path\":\"/5z2vuJk6P7V2azw3gWQF7L4l5xU.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":346671,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":257,\n" +
            "            \"vote_average\":5.7,\n" +
            "            \"title\":\"Little Evil\",\n" +
            "            \"release_date\":\"2017-08-08\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Little Evil\",\n" +
            "            \"genre_ids\":[\n" +
            "               35,\n" +
            "               27\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/8ufJoW3aI2VSFRNr7y1F4ntw21B.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Gary, who has just married Samantha, the woman of his dreams, discovers that her six-year-old son may be the Antichrist.\",\n" +
            "            \"poster_path\":\"/r3Trvfd5td7JUrIUr5xsDqwNWXJ.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":305344,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":2,\n" +
            "            \"vote_average\":10.0,\n" +
            "            \"title\":\"Never Here\",\n" +
            "            \"release_date\":\"2017-06-18\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Never Here\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/lfEbemFnuzVX0KN1ikp0hSfYKwR.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"An artist whose work involves capturing images of strangers begins to believe she herself is being observed.\",\n" +
            "            \"poster_path\":\"/obf37RsDsKDiANzk0tVRoI4QFOT.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":146233,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":3811,\n" +
            "            \"vote_average\":7.9,\n" +
            "            \"title\":\"Prisoners\",\n" +
            "            \"release_date\":\"2013-09-18\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Prisoners\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/cLGKawjQ5tUJCuDyR0OnGYT4fyf.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"When Keller Dover's daughter and her friend go missing, he takes matters into his own hands as the police pursue multiple leads and the pressure mounts. But just how far will this desperate father go to protect his family?\",\n" +
            "            \"poster_path\":\"/yAhqW57pwMAsCgmZpM5zSIVQVTh.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":436274,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":34,\n" +
            "            \"vote_average\":6.8,\n" +
            "            \"title\":\"Radius\",\n" +
            "            \"release_date\":\"2017-08-25\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Radius\",\n" +
            "            \"genre_ids\":[\n" +
            "               14,\n" +
            "               878,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/6WVZiBF7Sz6uPCgfOF0hBhRZpul.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Liam wakes from a car crash with no memory of who he is. As he makes his way into town to look for help, he finds only dead bodies, all with strange pale eyes. Liam's first assessment is that a virus is present in the air, but he soon discovers the horrible truth: anyone who comes within a 50-foot radius of him dies instantly.\",\n" +
            "            \"poster_path\":\"/3BHYW2Wlcu9ES41Y4OTeSgkhYkD.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/3vSrGsnMjzAycIU80udh7NFAJkP.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               9648,\n" +
            "               878\n" +
            "            ],\n" +
            "            \"id\":395814,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Rememory\",\n" +
            "            \"overview\":\"The widow of a wise professor stumbles upon one of his inventions that's able to record and play a person's memory.\",\n" +
            "            \"poster_path\":\"/qz3mvkpTOQOEqzxenvaaObOMarj.jpg\",\n" +
            "            \"release_date\":\"2017-09-08\",\n" +
            "            \"title\":\"Rememory\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":5.9,\n" +
            "            \"vote_count\":108\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":346685,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":2323,\n" +
            "            \"vote_average\":6.2,\n" +
            "            \"title\":\"The Girl on the Train\",\n" +
            "            \"release_date\":\"2016-10-05\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Girl on the Train\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               9648,\n" +
            "               53,\n" +
            "               10749\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/j8wWhGekyBPlgf2viVkptfwOyWi.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Rachel Watson, devastated by her recent divorce, spends her daily commute fantasizing about the seemingly perfect couple who live in a house that her train passes every day, until one morning she sees something shocking happen there and becomes entangled in the mystery that unfolds.\",\n" +
            "            \"poster_path\":\"/AhTO2QWG0tug7yDoh0XoaMhPt3J.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":11615,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":599,\n" +
            "            \"vote_average\":7.3,\n" +
            "            \"title\":\"The Life of David Gale\",\n" +
            "            \"release_date\":\"2003-02-21\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Life of David Gale\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/36EF5e1ZUJv6xnkOTm5s4vM33SC.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A man against capital punishment is accused of murdering a fellow activist and is sent to death row.\",\n" +
            "            \"poster_path\":\"/pwwDzbmTErcUFUPCV2fGSlHm4WP.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":369300,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":130,\n" +
            "            \"vote_average\":5.9,\n" +
            "            \"title\":\"The Limehouse Golem\",\n" +
            "            \"release_date\":\"2016-12-23\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Limehouse Golem\",\n" +
            "            \"genre_ids\":[\n" +
            "               27,\n" +
            "               9648,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/aHDhx1zRGP433UnV8A55KSG8tLF.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A series of murders has shaken the community to the point where people believe that only a legendary creature from dark times – the mythical Golem – must be responsible.\",\n" +
            "            \"poster_path\":\"/wvc4t0Hs31ChgIhHzvw49kGejXj.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/dqtosyPcgnotoMuo8wy4xwY1Bxe.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               36,\n" +
            "               10770\n" +
            "            ],\n" +
            "            \"id\":363992,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Wizard of Lies\",\n" +
            "            \"overview\":\"A look behind the scenes at Bernie Madoff's massive Ponzi scheme, how it was perpetrated on the public and the trail of destruction it left in its wake, both for the victims and Madoff's family.\",\n" +
            "            \"poster_path\":\"/8k4lJ4e0hvDQtKpItXmmPdw69sO.jpg\",\n" +
            "            \"release_date\":\"2017-05-21\",\n" +
            "            \"title\":\"The Wizard of Lies\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":6.5,\n" +
            "            \"vote_count\":129\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":49517,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":1006,\n" +
            "            \"vote_average\":6.6,\n" +
            "            \"title\":\"Tinker Tailor Soldier Spy\",\n" +
            "            \"release_date\":\"2011-09-16\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Tinker Tailor Soldier Spy\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               9648,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/bqpGceqQuHbtnjEqUG9acSYIVIh.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Recently-retired MI6 agent, George Smiley is doing his best to adjust to a life outside the secret service until a disgraced agent reappears with information concerning a mole at the heart of the service. Smiley is drawn back into the murky field of espionage, tasked with investigating which of his trusted former colleagues has chosen to betray him and their country. Smiley narrows his search to four suspects – all experienced, skilled and successful agents – but past histories, rivalries and friendships make it far from easy to pinpoint the man who is eating away at the heart of the British establishment.\",\n" +
            "            \"poster_path\":\"/2N3P730TYXEcNL0BO8WBuMc6yJz.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":203819,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":196,\n" +
            "            \"vote_average\":7.0,\n" +
            "            \"title\":\"Tracks\",\n" +
            "            \"release_date\":\"2014-03-06\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Tracks\",\n" +
            "            \"genre_ids\":[\n" +
            "               12,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/zLGbK69ZyWPzj5Pgb8tXjDJk8J2.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"Accompanied only by her faithful dog and four camels, an Australian satisfies her craving for solitude by embarking on a solo trip across the desert from Alice Springs to the Indian Ocean.\",\n" +
            "            \"poster_path\":\"/ysXVxDpfPvl6YmojfNYDz9zjVtb.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":395834,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":866,\n" +
            "            \"vote_average\":7.4,\n" +
            "            \"title\":\"Wind River\",\n" +
            "            \"release_date\":\"2017-08-03\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"Wind River\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               9648,\n" +
            "               53\n" +
            "            ],\n" +
            "            \"backdrop_path\":\"/iF9d73lbtDYeCsPhQmjtkEmlrYG.jpg\",\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"An FBI agent teams with the town's veteran game tracker to investigate a murder that occurred on a Native American reservation.\",\n" +
            "            \"poster_path\":\"/pySivdR845Hom4u4T2WNkJxe6Ad.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   }\n" +
            "]";

    private final static String JSON_TV_SHOW_DATA = "[   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Altered Carbon\",\n" +
            "            \"id\":68421,\n" +
            "            \"name\":\"Altered Carbon\",\n" +
            "            \"vote_count\":79,\n" +
            "            \"vote_average\":8.3,\n" +
            "            \"first_air_date\":\"2018-02-02\",\n" +
            "            \"poster_path\":\"/pZg2NUDPJA54AmDs1Y1ZLizBrpd.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               9648,\n" +
            "               10765\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/xETbCo8l06poxFUgbtaUeKmLadz.jpg\",\n" +
            "            \"overview\":\"After 250 years on ice, a prisoner returns to life in a new body with one chance to win his freedom: by solving a mind-bending murder.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Black Mirror\",\n" +
            "            \"id\":42009,\n" +
            "            \"name\":\"Black Mirror\",\n" +
            "            \"vote_count\":721,\n" +
            "            \"vote_average\":8.2,\n" +
            "            \"first_air_date\":\"2011-12-04\",\n" +
            "            \"poster_path\":\"/vGrS1mzlSHQQdOcmqH1zlE2iViY.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               18,\n" +
            "               10765\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/zSaEw7H0KpAFXQp8LzoBfoTUhwh.jpg\",\n" +
            "            \"overview\":\"A contemporary British re-working of The Twilight Zone with stories that tap into the collective unease about our modern world. \\n\\nOver the last ten years, technology has transformed almost every aspect of our lives before we've had time to stop and question it. In every home; on every desk; in every palm - a plasma screen; a monitor; a smartphone - a black mirror of our 21st Century existence.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Dark\",\n" +
            "            \"id\":70523,\n" +
            "            \"name\":\"Dark\",\n" +
            "            \"vote_count\":111,\n" +
            "            \"vote_average\":8.2,\n" +
            "            \"first_air_date\":\"2017-12-01\",\n" +
            "            \"poster_path\":\"/5LoHuHWA4H8jElFlZDvsmU2n63b.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               9648,\n" +
            "               10765\n" +
            "            ],\n" +
            "            \"original_language\":\"de\",\n" +
            "            \"backdrop_path\":\"/2VpSajCTI26zddsp5cSjqfCBKEa.jpg\",\n" +
            "            \"overview\":\"A missing child causes four families to help each other for answers. What they could not imagine is that this mystery would be connected to innumerable other secrets of the small town.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"DE\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Mindhunter\",\n" +
            "            \"id\":67744,\n" +
            "            \"name\":\"Mindhunter\",\n" +
            "            \"vote_count\":242,\n" +
            "            \"vote_average\":7.5,\n" +
            "            \"first_air_date\":\"2017-10-13\",\n" +
            "            \"poster_path\":\"/zVuc3Sfs6gyJm6M6Iq52jqdavw4.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/a906PH7CDmSOdS7kmnAgdWk5mhv.jpg\",\n" +
            "            \"overview\":\"An agent in the FBI's Elite Serial Crime Unit develops profiling techniques as he pursues notorious serial killers and rapists.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Prime Suspect 1973\",\n" +
            "            \"id\":70537,\n" +
            "            \"name\":\"Prime Suspect 1973\",\n" +
            "            \"vote_count\":10,\n" +
            "            \"vote_average\":8.2,\n" +
            "            \"first_air_date\":\"2017-03-02\",\n" +
            "            \"poster_path\":\"/4TdEYST0oHEJjzoKxP8OzfjX9Bc.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/kLA4ZHhhi5cASoiFhSS5xfSQkCq.jpg\",\n" +
            "            \"overview\":\"Prime Suspect 1973 tells the story of 22-year-old Jane Tennison's first days in the police force, in which she endured flagrant sexism before being thrown in at the deep end with a murder enquiry.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Red Dwarf\",\n" +
            "            \"id\":326,\n" +
            "            \"name\":\"Red Dwarf\",\n" +
            "            \"vote_count\":117,\n" +
            "            \"vote_average\":7.9,\n" +
            "            \"first_air_date\":\"1988-02-15\",\n" +
            "            \"poster_path\":\"/gZqZ1iUEiy9BqpKZugzfNaGxWrX.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               35,\n" +
            "               10765\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/bbjbid6OegsqbWNQcirralrtnW5.jpg\",\n" +
            "            \"overview\":\"The adventures of the last human alive and his friends, stranded three million years into deep space on the mining ship Red Dwarf.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Affair\",\n" +
            "            \"id\":61463,\n" +
            "            \"name\":\"The Affair\",\n" +
            "            \"vote_count\":96,\n" +
            "            \"vote_average\":6.3,\n" +
            "            \"first_air_date\":\"2014-10-12\",\n" +
            "            \"poster_path\":\"/4GIe35RiqCvwFlwIndcyucbw9uT.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               18\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/ap8MHQTLU9DYVrvGp5616SH0lmH.jpg\",\n" +
            "            \"overview\":\"The Affair explores the emotional effects of an extramarital relationship between Noah Solloway and Alison Lockhart after the two meet in the resort town of Montauk in Long Island. Noah is a New York City schoolteacher with one novel published (book entitled A Person who Visits a Place) and he is struggling to write a second book. He is happily married with four children, but resents his dependence on his wealthy father-in-law. Alison is a young waitress trying to piece her life and marriage back together in the wake of the tragic death of her child. The story of the affair is told separately, complete with distinct memory biases, from the male and female perspectives.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"adult\":false,\n" +
            "            \"backdrop_path\":\"/xrOt3C9PcxgNWLlmeZirwYr2fX.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               99,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"id\":458298,\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Keepers\",\n" +
            "            \"overview\":\"A seven-part docuseries about the unsolved murder of a nun and the horrific secrets and pain that linger nearly five decades after her death.\",\n" +
            "            \"poster_path\":\"/7xwOmCNOTcb5GUfX7r62LUwBKID.jpg\",\n" +
            "            \"release_date\":\"2017-05-19\",\n" +
            "            \"title\":\"The Keepers\",\n" +
            "            \"video\":false,\n" +
            "            \"vote_average\":7.7,\n" +
            "            \"vote_count\":27\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Keepers\",\n" +
            "            \"id\":26101,\n" +
            "            \"name\":\"The Keepers\",\n" +
            "            \"vote_count\":7,\n" +
            "            \"vote_average\":7.4,\n" +
            "            \"first_air_date\":\"2017-05-19\",\n" +
            "            \"poster_path\":\"/kgZE2Hx2zCGNJMPbOet9B7IcWbu.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/kPdGDmtdx626ditcWERhJPFwz1J.jpg\",\n" +
            "            \"overview\":\"This docuseries examines the decades-old murder of Sister Catherine Cesnik and its suspected link to a priest accused of abuse.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"backdrop_path\":\"/yyLL7i1fxu5S8848U315960V0dZ.jpg\",\n" +
            "            \"first_air_date\":\"2011-04-03\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"id\":34415,\n" +
            "            \"name\":\"The Killing\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_name\":\"The Killing\",\n" +
            "            \"overview\":\"The Killing is an American crime drama television series based upon the Danish television series Forbrydelsen. Set in Seattle, Washington, the series follows the various murder investigations by homicide detectives Sarah Linden and Stephen Holder.\",\n" +
            "            \"poster_path\":\"/fBqKVQt01vBinQVnE0BEfiydiwh.jpg\",\n" +
            "            \"vote_average\":7.4,\n" +
            "            \"vote_count\":195\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":462932,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":1,\n" +
            "            \"vote_average\":8.0,\n" +
            "            \"title\":\"The Loch\",\n" +
            "            \"release_date\":\"2017-06-11\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Loch\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18,\n" +
            "               9648\n" +
            "            ],\n" +
            "            \"backdrop_path\":null,\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"The search for a serial killer becomes a matter of life and death for detective Annie Redford, who is trying to cope with her first murder case.\",\n" +
            "            \"poster_path\":\"/aZneL2mleTuhjppa2QwXIOlXV7o.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Loch\",\n" +
            "            \"id\":72061,\n" +
            "            \"name\":\"The Loch\",\n" +
            "            \"vote_count\":6,\n" +
            "            \"vote_average\":5.9,\n" +
            "            \"first_air_date\":\"2017-06-11\",\n" +
            "            \"poster_path\":\"/8EMzjZY2fVaP6qO1MkgANDjm4nH.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/79R7JJ3LGPVpA57xu18uMU3qmur.jpg\",\n" +
            "            \"overview\":\"The search for a serial killer becomes a matter of life and death for detective Annie Redford, who is trying to cope with her first murder case.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Unforgotten\",\n" +
            "            \"id\":62505,\n" +
            "            \"name\":\"Unforgotten\",\n" +
            "            \"vote_count\":25,\n" +
            "            \"vote_average\":7.6,\n" +
            "            \"first_air_date\":\"2015-10-08\",\n" +
            "            \"poster_path\":\"/93xoQvdgZCmPx4GHorgz2ibA4P9.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               18\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/dkjYZ6tUpkcPWKkEnYH24xgtVxI.jpg\",\n" +
            "            \"overview\":\"'Unforgotten' follows modern police team DCI Cassie Stuart and DI Sunny Khan, who gradually unravel long-forgotten secrets which have a dramatic impact on their investigation and the four potential suspects. The slow revelation of the secrets will also affect the personal lives of both Sunny and Cassie.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Law \\u0026 Order True Crime\",\n" +
            "            \"id\":72496,\n" +
            "            \"name\":\"Law \\u0026 Order True Crime\",\n" +
            "            \"vote_count\":2,\n" +
            "            \"vote_average\":3.5,\n" +
            "            \"first_air_date\":\"2017-09-26\",\n" +
            "            \"poster_path\":\"/14T6cTwynqxU10e1cCnSc75AcNa.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               80,\n" +
            "               18\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/o9YZvh82gSfkZuScn4XM9xeNeCY.jpg\",\n" +
            "            \"overview\":\"An anthology series that delves into the players, the crime and the media circus, detailing the day-to-day battles of the trial and unveiling the shocking truth of what really went down when the cameras stopped rolling.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"Star Trek: Discovery\",\n" +
            "            \"id\":67198,\n" +
            "            \"name\":\"Star Trek: Discovery\",\n" +
            "            \"vote_count\":279,\n" +
            "            \"vote_average\":6.7,\n" +
            "            \"first_air_date\":\"2017-09-24\",\n" +
            "            \"poster_path\":\"/ihvG9dCEnVU3gmMUftTkRICNdJf.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               10765\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/s3kVP6R3LbJvvoPnDQEcJNEH2d0.jpg\",\n" +
            "            \"overview\":\"Ten years before Kirk, Spock, and the Enterprise there was Discovery.  Star Trek, one of the most iconic and influential global television franchises, returns 50 years after it first premiered featuring a new ship, new characters and new missions, while embracing the same ideology and hope for the future that inspired a generation of dreamers and doers.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   }\n" +
            "]";

    private final static String JSON_DOCUMENTARY_DATA = "[   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Nineties\",\n" +
            "            \"id\":72757,\n" +
            "            \"name\":\"The Nineties\",\n" +
            "            \"vote_count\":0,\n" +
            "            \"vote_average\":0.0,\n" +
            "            \"first_air_date\":\"2017-07-09\",\n" +
            "            \"poster_path\":\"/7zWwsdY6BvB3jXDOOAKKQgY2VSF.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/eujU3vpBvZNOExepuL3ezTN9N5W.jpg\",\n" +
            "            \"overview\":\"Hit rewind and explore the most iconic moments and influential people of The Nineties, the decade that gave us the Internet, DVDs, and other cultural and political milestones.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":390942,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":1,\n" +
            "            \"vote_average\":8.0,\n" +
            "            \"title\":\"The Eighties\",\n" +
            "            \"release_date\":\"2016-03-31\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Eighties\",\n" +
            "            \"genre_ids\":[\n" +
            "\n" +
            "            ],\n" +
            "            \"backdrop_path\":null,\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A documentary series focusing on the Reagan presidency, the AIDS crisis, the end of the Cold War, Wall Street corruption, the tech boom, the expansion of television, and the evolving music industry.\",\n" +
            "            \"poster_path\":\"/zyn5C9IIdEJ4bwoSE4NpWapuvvV.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Eighties\",\n" +
            "            \"id\":66482,\n" +
            "            \"name\":\"The Eighties\",\n" +
            "            \"vote_count\":2,\n" +
            "            \"vote_average\":8.8,\n" +
            "            \"first_air_date\":\"2016-03-31\",\n" +
            "            \"poster_path\":\"/oL7pMz3XbR8VGFLpFRlxqDnkrga.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/eugeu0zAMUNwxrF1t8WpdzpEId7.jpg\",\n" +
            "            \"overview\":\"The third installment from executive producers Tom Hanks, Gary Goetzman and Mark Herzog, following in the footsteps of critically-acclaimed series \\\"The Sixties\\\" and \\\"The Seventies,\\\" tackles 10 years shaped by exceptionalism and excess. Like its predecessors, \\\"The Eighties\\\" intersperses rare archival newsreel footage, interviews, and comments by historians, journalists, politicians, celebrities and others, painting a perspective-rich picture of a vibrant decade. Episodes examine the age of Reagan, the AIDS crisis, the end of the Cold War, Wall Street corruption, the evolving TV and music scene, and everything in between.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":357213,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":2,\n" +
            "            \"vote_average\":8.0,\n" +
            "            \"title\":\"The Seventies\",\n" +
            "            \"release_date\":\"2015-06-11\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Seventies\",\n" +
            "            \"genre_ids\":[\n" +
            "\n" +
            "            ],\n" +
            "            \"backdrop_path\":null,\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A documentary series focusing on the ongoing Vietnam War, the Watergate scandal, evolving music industry, the Iran Hostage Crisis, the sexual revolution, and the rise of foreign and domestic terrorism.\",\n" +
            "            \"poster_path\":\"/6anTIHEo8h3Q3qyBpqwbuZgBUhU.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Seventies\",\n" +
            "            \"id\":62811,\n" +
            "            \"name\":\"The Seventies\",\n" +
            "            \"vote_count\":2,\n" +
            "            \"vote_average\":8.5,\n" +
            "            \"first_air_date\":\"2015-06-11\",\n" +
            "            \"poster_path\":\"/8gVRTXIk2QP5h2YuXrhamP2oOud.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/h4VauXolH7uvvDijohds9Ia12wr.jpg\",\n" +
            "            \"overview\":\"A documentary series focusing on the ongoing Vietnam War, the Watergate scandal, evolving music industry, the Iran Hostage Crisis, the sexual revolution, and the rise of foreign and domestic terrorism.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "         {\n" +
            "            \"id\":357125,\n" +
            "            \"video\":false,\n" +
            "            \"vote_count\":4,\n" +
            "            \"vote_average\":6.8,\n" +
            "            \"title\":\"The Sixties\",\n" +
            "            \"release_date\":\"2013-06-14\",\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_title\":\"The Sixties\",\n" +
            "            \"genre_ids\":[\n" +
            "\n" +
            "            ],\n" +
            "            \"backdrop_path\":null,\n" +
            "            \"adult\":false,\n" +
            "            \"overview\":\"A ten-part documentary series focusing on the politics, music, technical advancements, drugs, and the \\\"free love\\\" movement of the 1960s.\",\n" +
            "            \"poster_path\":\"/wD73Poz4usaFzpelOH5w7SmvWhg.jpg\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"original_name\":\"The Sixties\",\n" +
            "            \"id\":60909,\n" +
            "            \"name\":\"The Sixties\",\n" +
            "            \"vote_count\":3,\n" +
            "            \"vote_average\":8.7,\n" +
            "            \"first_air_date\":\"2014-05-29\",\n" +
            "            \"poster_path\":\"/qOa0666IruwNBzwQjPDScHws4zu.jpg\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"backdrop_path\":\"/lR0VPqsrRLX8BVKX1CRb3DqU5CY.jpg\",\n" +
            "            \"overview\":\"The space race, the cold war, \\\"free love,\\\" civil rights and more: The decade of the 1960s shaped our history -- and changed the world. In collaboration with Tom Hanks, Gary Goetzman and Mark Herzog, CNN explores perhaps the most transformative decade of the modern era in a 10-part documentary series and brings new insights into how those events shaped today.\",\n" +
            "            \"origin_country\":[\n" +
            "               \"US\"\n" +
            "            ]\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"backdrop_path\":\"/5Eehqt8Sp7LaHCroubfvk89xEi6.jpg\",\n" +
            "            \"first_air_date\":\"2017-12-22\",\n" +
            "            \"genre_ids\":[\n" +
            "\n" +
            "            ],\n" +
            "            \"id\":75871,\n" +
            "            \"name\":\"The Toys That Made Us\",\n" +
            "            \"origin_country\":[\n" +
            "\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_name\":\"The Toys That Made Us\",\n" +
            "            \"overview\":\"The minds behind history's most iconic toy franchises discuss the rise -- and sometimes fall -- of their billion-dollar creations.\",\n" +
            "            \"poster_path\":\"/mEStRaQJxfL6dfBv3jgjxH6rESR.jpg\",\n" +
            "            \"vote_average\":8.0,\n" +
            "            \"vote_count\":3\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"backdrop_path\":\"/fFMrKQcLPf8NkEjTqiGURPILc2v.jpg\",\n" +
            "            \"first_air_date\":\"2017-09-28\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"id\":74309,\n" +
            "            \"name\":\"Russia with Simon Reeve\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_name\":\"Russia with Simon Reeve\",\n" +
            "            \"overview\":\"One hundred years after the Russian Revolution, Simon Reeve embarks on an extraordinary three-part journey across Russia.\",\n" +
            "            \"poster_path\":\"/lRXV5nzbO5i12PVNap6LY55dYmH.jpg\",\n" +
            "            \"vote_average\":8.0,\n" +
            "            \"vote_count\":1\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "         {\n" +
            "            \"backdrop_path\":\"/kfOBMcF05qmm4yu293XiZ4iJJKH.jpg\",\n" +
            "            \"first_air_date\":\"2016-10-15\",\n" +
            "            \"genre_ids\":[\n" +
            "               99\n" +
            "            ],\n" +
            "            \"id\":74398,\n" +
            "            \"name\":\"Britain's Ancient Tracks with Tony Robinson\",\n" +
            "            \"origin_country\":[\n" +
            "               \"GB\"\n" +
            "            ],\n" +
            "            \"original_language\":\"en\",\n" +
            "            \"original_name\":\"Britain's Ancient Tracks with Tony Robinson\",\n" +
            "            \"overview\":\"Tony Robinson walks our oldest roads to find the truth behind the megaliths, burial sites, ley lines and hidden caves along their path, and connect the clues they have left hidden in the British landscape.\",\n" +
            "            \"poster_path\":\"/z645UMyaA1YQBEUWFLwqPoHqPqD.jpg\",\n" +
            "            \"vote_average\":0.0,\n" +
            "            \"vote_count\":0\n" +
            "         }\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   },\n" +
            "   {\n" +
            "      \"movie_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"person_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_episode_results\":[\n" +
            "\n" +
            "      ],\n" +
            "      \"tv_season_results\":[\n" +
            "\n" +
            "      ]\n" +
            "   }\n" +
            "]";

}
