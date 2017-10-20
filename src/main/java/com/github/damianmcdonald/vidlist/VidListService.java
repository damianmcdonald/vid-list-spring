package com.github.damianmcdonald.vidlist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Component
public class VidListService {

    @Value("${api.key}")
    private String API_KEY;

    @Value("${api.url}")
    private String API_URL;

    @Value("${vid.ids}")
    private String[] VID_IDS;

    protected String[] getVidIds() {
        return VID_IDS;
    }

    protected String getVideoDataById(final String id) {
        final String formattedUrl = String.format(API_URL, id, API_KEY);
        final String result = new RestTemplate().getForEntity(formattedUrl, String.class).getBody();
        try {
            Files.write(Paths.get("/opt/scratch/vid-data.json"), result.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected String getVideoData() {
        return JSON_VIDEO_DATA;
    }

    private final static String JSON_VIDEO_DATA = "{\n" +
            "\t\"results\": [{\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/r9SSeTSksoKhy8SRhGcsbJcVScX.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-03-05\",\n" +
            "\t\t\t\"genre_ids\": [18],\n" +
            "\t\t\t\"id\": 69851,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"FEUD\",\n" +
            "\t\t\t\"overview\": \"Anthology series of famous feuds with the first season based on the legendary rivalry between Bette Davis and Joan Crawford which began early on their careers, climaxed on the set of \\\"Whatever Happened to Baby Jane?\\\" and evolved into an Oscar vendetta.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/rrUA6J9yQSKlhyIWSjv6JIDzr1V.jpg\",\n" +
            "\t\t\t\"popularity\": 11.660954,\n" +
            "\t\t\t\"name\": \"FEUD\",\n" +
            "\t\t\t\"vote_average\": 7.6,\n" +
            "\t\t\t\"vote_count\": 44\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/gX8SYlnL9ZznfZwEH4KJUePBFUM.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2011-04-17\",\n" +
            "\t\t\t\"genre_ids\": [10765, 18, 10759],\n" +
            "\t\t\t\"id\": 1399,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Game of Thrones\",\n" +
            "\t\t\t\"overview\": \"Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/gwPSoYUHAKmdyVywgLpKKA4BjRr.jpg\",\n" +
            "\t\t\t\"popularity\": 95.373923,\n" +
            "\t\t\t\"name\": \"Game of Thrones\",\n" +
            "\t\t\t\"vote_average\": 8.1,\n" +
            "\t\t\t\"vote_count\": 3745\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/iuiaAx5wNlbDCAO0wiQy0RIlUt.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2015-08-28\",\n" +
            "\t\t\t\"genre_ids\": [80, 18],\n" +
            "\t\t\t\"id\": 63351,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Narcos\",\n" +
            "\t\t\t\"overview\": \"The true story of Colombia's infamously violent and powerful drug cartels.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/rTmal9fDbwh5F0waol2hq35U4ah.jpg\",\n" +
            "\t\t\t\"popularity\": 27.370774,\n" +
            "\t\t\t\"name\": \"Narcos\",\n" +
            "\t\t\t\"vote_average\": 7.9,\n" +
            "\t\t\t\"vote_count\": 392\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/upYyxQvggIglgAHWjMxFjJDiJ4b.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-06-23\",\n" +
            "\t\t\t\"genre_ids\": [35],\n" +
            "\t\t\t\"id\": 70573,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"GLOW\",\n" +
            "\t\t\t\"overview\": \"In 1980s LA, a crew of misfits reinvent themselves as the Gorgeous Ladies of Wrestling.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/lJKM7gl7r88M1bOR2z3ymXNaGcs.jpg\",\n" +
            "\t\t\t\"popularity\": 8.004425000000001,\n" +
            "\t\t\t\"name\": \"GLOW\",\n" +
            "\t\t\t\"vote_average\": 8.4,\n" +
            "\t\t\t\"vote_count\": 21\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/z2ZmYbhk0McewduBFtCqkmcZoqT.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-08-01\",\n" +
            "\t\t\t\"genre_ids\": [18, 80],\n" +
            "\t\t\t\"id\": 72597,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Manhunt: Unabomber\",\n" +
            "\t\t\t\"overview\": \"Follow Jim Fitzgerald, the FBI agent who tracked down Ted Kaczynksi, aka the “Unabomber,” and brought him to justice through his expertise in profiling and linguistics.\",\n" +
            "\t\t\t\"origin_country\": [],\n" +
            "\t\t\t\"poster_path\": \"/gmSOPIOenH39XHEdtfPwgi2lWNj.jpg\",\n" +
            "\t\t\t\"popularity\": 5.087645,\n" +
            "\t\t\t\"name\": \"Manhunt: Unabomber\",\n" +
            "\t\t\t\"vote_average\": 5.5,\n" +
            "\t\t\t\"vote_count\": 6\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/iktfRjKSqXNdWP8twWWBwv6Anr0.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-08-09\",\n" +
            "\t\t\t\"genre_ids\": [18],\n" +
            "\t\t\t\"id\": 70485,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Mr. Mercedes\",\n" +
            "\t\t\t\"overview\": \"A demented serial killer taunts a retired police detective with a series of lurid letters and emails, forcing the ex-cop to undertake a private, and potentially felonious, crusade to bring the killer to justice before he can strike again. Based on the bestselling novel by Stephen King.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/jq8RyL2fhdS5FCvEufhers9yxUJ.jpg\",\n" +
            "\t\t\t\"popularity\": 15.044462,\n" +
            "\t\t\t\"name\": \"Mr. Mercedes\",\n" +
            "\t\t\t\"vote_average\": 6.2,\n" +
            "\t\t\t\"vote_count\": 29\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/hmI6jwT7AwMJWDA3Fk8NDDcF82R.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2013-03-18\",\n" +
            "\t\t\t\"genre_ids\": [80, 18, 9648],\n" +
            "\t\t\t\"id\": 46638,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Top of the Lake\",\n" +
            "\t\t\t\"overview\": \"A woman haunted by her past, Detective Robin Griffin, investigates complex and unsettling cases.\",\n" +
            "\t\t\t\"origin_country\": [\"NZ\", \"AU\", \"GB\", \"US\"],\n" +
            "\t\t\t\"poster_path\": \"/tYFs0BiO3ZFaKfQiMPVrnw9G5yd.jpg\",\n" +
            "\t\t\t\"popularity\": 8.178143,\n" +
            "\t\t\t\"name\": \"Top of the Lake\",\n" +
            "\t\t\t\"vote_average\": 6.9,\n" +
            "\t\t\t\"vote_count\": 75\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/eLluMqJUIBRo0M5AP6ckLcSyeSb.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-07-21\",\n" +
            "\t\t\t\"genre_ids\": [80, 18],\n" +
            "\t\t\t\"id\": 69740,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Ozark\",\n" +
            "\t\t\t\"overview\": \"A financial adviser drags his family from Chicago to the Missouri Ozarks, where he must launder $500 million in five years to appease a drug boss.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/pCGyPVrI9Fzw6rE1Pvi4BIXF6ET.jpg\",\n" +
            "\t\t\t\"popularity\": 24.365849,\n" +
            "\t\t\t\"name\": \"Ozark\",\n" +
            "\t\t\t\"vote_average\": 8.1,\n" +
            "\t\t\t\"vote_count\": 75\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/ijX8tWeMBMPwEPKNpSavyd9334r.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2013-06-30\",\n" +
            "\t\t\t\"genre_ids\": [18],\n" +
            "\t\t\t\"id\": 1423,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Ray Donovan\",\n" +
            "\t\t\t\"overview\": \"Ray Donovan, a professional “fixer” for the rich and famous in L.A., can make anyone's problems disappear except those created by his own family.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/a3aR1VcaqP4nG3khMjMUu0Berhl.jpg\",\n" +
            "\t\t\t\"popularity\": 38.318103,\n" +
            "\t\t\t\"name\": \"Ray Donovan\",\n" +
            "\t\t\t\"vote_average\": 7.2,\n" +
            "\t\t\t\"vote_count\": 228\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/1lgss4ZTOsFgY0p9xRf4hl85BNR.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-04-26\",\n" +
            "\t\t\t\"genre_ids\": [18, 10765],\n" +
            "\t\t\t\"id\": 69478,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"The Handmaid's Tale\",\n" +
            "\t\t\t\"overview\": \"Set in a dystopian future, a woman is forced to live as a concubine under a fundamentalist theocratic dictatorship. A TV adaptation of Margaret Atwood's novel.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/n73rGFjtJvlEqDeW5LypSgOwcuO.jpg\",\n" +
            "\t\t\t\"popularity\": 16.061685,\n" +
            "\t\t\t\"name\": \"The Handmaid's Tale\",\n" +
            "\t\t\t\"vote_average\": 8.1,\n" +
            "\t\t\t\"vote_count\": 101\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/nsVueoSwrgZBxlFaankiPIhNRPH.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2015-01-15\",\n" +
            "\t\t\t\"genre_ids\": [18, 10765],\n" +
            "\t\t\t\"id\": 62017,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"The Man in the High Castle\",\n" +
            "\t\t\t\"overview\": \"Based on Philip K. Dick's award-winning novel, The Man in the High Castle explores what it would be like if the Allied Powers had lost WWII, and Japan and Germany ruled the United States.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/m4QvniiInCezPAJGDizky7452LJ.jpg\",\n" +
            "\t\t\t\"popularity\": 17.782106,\n" +
            "\t\t\t\"name\": \"The Man in the High Castle\",\n" +
            "\t\t\t\"vote_average\": 7.4,\n" +
            "\t\t\t\"vote_count\": 191\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/6IW2GXP3WXSF1LW8CHjtwZ7tprk.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2012-04-22\",\n" +
            "\t\t\t\"genre_ids\": [35],\n" +
            "\t\t\t\"id\": 2947,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Veep\",\n" +
            "\t\t\t\"overview\": \"A look into American politics, revolving around former Senator Selina Meyer who finds being Vice President of the United States is nothing like she expected and everything everyone ever warned her about.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/cdd78fGdaA3EbK2ToZRWcaaB1fx.jpg\",\n" +
            "\t\t\t\"popularity\": 16.51739,\n" +
            "\t\t\t\"name\": \"Veep\",\n" +
            "\t\t\t\"vote_average\": 7.0,\n" +
            "\t\t\t\"vote_count\": 111\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/m6TxgXteAkyI1ChReyghVNXyjoM.jpg\",\n" +
            "\t\t\t\"genre_ids\": [80, 18, 9648],\n" +
            "\t\t\t\"id\": 4771,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Gone Baby Gone\",\n" +
            "\t\t\t\"overview\": \"When 4 year old Amanda McCready disappears from her home and the police make little headway in solving the case, the girl's aunt, Beatrice McCready hires two private detectives, Patrick Kenzie and Angie Gennaro. The detectives freely admit that they have little experience with this type of case, but the family wants them for two reasons - they're not cops and they know the tough neighborhood in which they all live. As the case progresses, Kenzie and Gennaro face drug dealers, gangs and pedophiles. When they are about to solve the case, they are faced with a moral dilemma that tears them apart.\",\n" +
            "\t\t\t\"release_date\": \"2007-10-19\",\n" +
            "\t\t\t\"poster_path\": \"/dXXMPxGiRegd7NNCtE5uchAKRAG.jpg\",\n" +
            "\t\t\t\"popularity\": 11.122819,\n" +
            "\t\t\t\"title\": \"Gone Baby Gone\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 7.2,\n" +
            "\t\t\t\"vote_count\": 1026\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/o9YZvh82gSfkZuScn4XM9xeNeCY.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-09-26\",\n" +
            "\t\t\t\"genre_ids\": [80, 18],\n" +
            "\t\t\t\"id\": 72496,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Law & Order True Crime\",\n" +
            "\t\t\t\"overview\": \"An anthology series that delves into the players, the crime and the media circus, detailing the day-to-day battles of the trial and unveiling the shocking truth of what really went down when the cameras stopped rolling.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/14T6cTwynqxU10e1cCnSc75AcNa.jpg\",\n" +
            "\t\t\t\"popularity\": 16.135314,\n" +
            "\t\t\t\"name\": \"Law & Order True Crime\",\n" +
            "\t\t\t\"vote_average\": 6.0,\n" +
            "\t\t\t\"vote_count\": 1\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/1ydGpnIumfRNAtW2YJ5pgj0n0Pc.jpg\",\n" +
            "\t\t\t\"genre_ids\": [80, 9648, 53],\n" +
            "\t\t\t\"id\": 12245,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Oxford Murders\",\n" +
            "\t\t\t\"overview\": \"At Oxford University, a professor and a grad student work together to try and stop a potential series of murders seemingly linked by mathematical symbols\",\n" +
            "\t\t\t\"release_date\": \"2008-01-18\",\n" +
            "\t\t\t\"poster_path\": \"/6RXkLDMnKXhPfxanHDFffJh575B.jpg\",\n" +
            "\t\t\t\"popularity\": 7.097708,\n" +
            "\t\t\t\"title\": \"The Oxford Murders\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.7,\n" +
            "\t\t\t\"vote_count\": 191\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/bqpGceqQuHbtnjEqUG9acSYIVIh.jpg\",\n" +
            "\t\t\t\"genre_ids\": [18, 53, 9648],\n" +
            "\t\t\t\"id\": 49517,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Tinker Tailor Soldier Spy\",\n" +
            "\t\t\t\"overview\": \"Recently-retired MI6 agent, George Smiley is doing his best to adjust to a life outside the secret service until a disgraced agent reappears with information concerning a mole at the heart of the service. Smiley is drawn back into the murky field of espionage, tasked with investigating which of his trusted former colleagues has chosen to betray him and their country. Smiley narrows his search to four suspects – all experienced, skilled and successful agents – but past histories, rivalries and friendships make it far from easy to pinpoint the man who is eating away at the heart of the British establishment.\",\n" +
            "\t\t\t\"release_date\": \"2011-09-16\",\n" +
            "\t\t\t\"poster_path\": \"/2N3P730TYXEcNL0BO8WBuMc6yJz.jpg\",\n" +
            "\t\t\t\"popularity\": 11.252982,\n" +
            "\t\t\t\"title\": \"Tinker Tailor Soldier Spy\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.6,\n" +
            "\t\t\t\"vote_count\": 855\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/bsa7cusK4Uw7wX7szy8ilXiJavN.jpg\",\n" +
            "\t\t\t\"genre_ids\": [53, 80, 18, 9648],\n" +
            "\t\t\t\"id\": 68727,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Trance\",\n" +
            "\t\t\t\"overview\": \"A fine art auctioneer mixed up with a gang, joins forces with a hypnotherapist to recover a lost painting. As boundaries between desire, reality and hypnotic suggestion begin to blur, the stakes rise faster than anyone could have anticipated.\",\n" +
            "\t\t\t\"release_date\": \"2013-03-27\",\n" +
            "\t\t\t\"poster_path\": \"/cr1vVtymoiW23ETEycUgiAZYMur.jpg\",\n" +
            "\t\t\t\"popularity\": 7.117164,\n" +
            "\t\t\t\"title\": \"Trance\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.5,\n" +
            "\t\t\t\"vote_count\": 980\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/rf5j1avHtvLkVnBLdGmqh1LbIN0.jpg\",\n" +
            "\t\t\t\"genre_ids\": [53],\n" +
            "\t\t\t\"id\": 6145,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Fracture\",\n" +
            "\t\t\t\"overview\": \"A husband is on trial for the attempted murder of his wife, in what is seemingly an open/shut case for the ambitious district attorney trying to put him away. However, there are surprises for both around every corner, and, as a suspenseful game of cat-and-mouse is played out, each must manipulate and outwit the other.\",\n" +
            "\t\t\t\"release_date\": \"2007-04-20\",\n" +
            "\t\t\t\"poster_path\": \"/z8dmpPvIybKIlSuzPnt0TQmrYxd.jpg\",\n" +
            "\t\t\t\"popularity\": 7.817542,\n" +
            "\t\t\t\"title\": \"Fracture\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 7.2,\n" +
            "\t\t\t\"vote_count\": 897\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/aHDhx1zRGP433UnV8A55KSG8tLF.jpg\",\n" +
            "\t\t\t\"genre_ids\": [27, 53],\n" +
            "\t\t\t\"id\": 369300,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Limehouse Golem\",\n" +
            "\t\t\t\"overview\": \"A series of murders has shaken the community to the point where people believe that only a legendary creature from dark times – the mythical Golem – must be responsible.\",\n" +
            "\t\t\t\"release_date\": \"2017-08-31\",\n" +
            "\t\t\t\"poster_path\": \"/iAb5WtINIbTRyXu0HFwnr4c6tP7.jpg\",\n" +
            "\t\t\t\"popularity\": 10.149913,\n" +
            "\t\t\t\"title\": \"The Limehouse Golem\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.2,\n" +
            "\t\t\t\"vote_count\": 44\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/mtBguy4PRzFZ0xQC6VoYz7Knmef.jpg\",\n" +
            "\t\t\t\"genre_ids\": [53],\n" +
            "\t\t\t\"id\": 310133,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Cop Car\",\n" +
            "\t\t\t\"overview\": \"Two kids find themselves in the centre of a deadly game of cat and mouse after taking a sheriff's cruiser for a joy ride.\",\n" +
            "\t\t\t\"release_date\": \"2015-08-07\",\n" +
            "\t\t\t\"poster_path\": \"/6LTj0CJhpOFISrpHJQD0aUILnFS.jpg\",\n" +
            "\t\t\t\"popularity\": 12.148315,\n" +
            "\t\t\t\"title\": \"Cop Car\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.8,\n" +
            "\t\t\t\"vote_count\": 299\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/dqtosyPcgnotoMuo8wy4xwY1Bxe.jpg\",\n" +
            "\t\t\t\"genre_ids\": [80, 18, 36, 10770],\n" +
            "\t\t\t\"id\": 363992,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Wizard of Lies\",\n" +
            "\t\t\t\"overview\": \"A look behind the scenes at Bernie Madoff's massive Ponzi scheme, how it was perpetrated on the public and the trail of destruction it left in its wake, both for the victims and Madoff's family.\",\n" +
            "\t\t\t\"release_date\": \"2017-05-21\",\n" +
            "\t\t\t\"poster_path\": \"/8k4lJ4e0hvDQtKpItXmmPdw69sO.jpg\",\n" +
            "\t\t\t\"popularity\": 15.19522,\n" +
            "\t\t\t\"title\": \"The Wizard of Lies\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.5,\n" +
            "\t\t\t\"vote_count\": 100\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/3vSrGsnMjzAycIU80udh7NFAJkP.jpg\",\n" +
            "\t\t\t\"genre_ids\": [878, 18, 9648],\n" +
            "\t\t\t\"id\": 395814,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Rememory\",\n" +
            "\t\t\t\"overview\": \"The widow of a wise professor stumbles upon one of his inventions that's able to record and play a person's memory.\",\n" +
            "\t\t\t\"release_date\": \"2017-09-08\",\n" +
            "\t\t\t\"poster_path\": \"/1PUlg2uuPtVPUVB5GE5D4ihaMku.jpg\",\n" +
            "\t\t\t\"popularity\": 35.200118,\n" +
            "\t\t\t\"title\": \"Rememory\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.9,\n" +
            "\t\t\t\"vote_count\": 63\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/jaQe5U0CTjk0h3stMrkZG9qnSVh.jpg\",\n" +
            "\t\t\t\"genre_ids\": [27, 9648, 53],\n" +
            "\t\t\t\"id\": 418078,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"It Comes at Night\",\n" +
            "\t\t\t\"overview\": \"Secure within a desolate home as an unnatural threat terrorizes the world, a man has established a tenuous domestic order with his wife and son, but this will soon be put to test when a desperate young family arrives seeking refuge.\",\n" +
            "\t\t\t\"release_date\": \"2017-06-09\",\n" +
            "\t\t\t\"poster_path\": \"/h9VOirT4dKXzVyVzZZxPfAghmRV.jpg\",\n" +
            "\t\t\t\"popularity\": 16.346817,\n" +
            "\t\t\t\"title\": \"It Comes at Night\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.6,\n" +
            "\t\t\t\"vote_count\": 364\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/eUGNCnMw78aLFfaAa0oHqyTnNuW.jpg\",\n" +
            "\t\t\t\"genre_ids\": [27, 18, 53],\n" +
            "\t\t\t\"id\": 420707,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Cage Dive\",\n" +
            "\t\t\t\"overview\": \"Three friends from California are filming an audition tape for an extreme reality game show. They document their journey to Australia where they will be doing their most dangerous activity.... Shark Cage Diving. A catastrophic turn of events leaves them in baited water full of Great White Sharks, turning their recording into a blood chilling diary of survival... and death.\",\n" +
            "\t\t\t\"release_date\": \"2017-08-11\",\n" +
            "\t\t\t\"poster_path\": \"/3uUO9eDxHeDREIX77BaQiI88ajp.jpg\",\n" +
            "\t\t\t\"popularity\": 9.328647999999999,\n" +
            "\t\t\t\"title\": \"Cage Dive\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 4.4,\n" +
            "\t\t\t\"vote_count\": 31\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/pVVobDO8cezhVPvwD6EBUN0g3mt.jpg\",\n" +
            "\t\t\t\"genre_ids\": [28, 37, 878, 14, 27],\n" +
            "\t\t\t\"id\": 353491,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Dark Tower\",\n" +
            "\t\t\t\"overview\": \"The last Gunslinger, Roland Deschain, has been locked in an eternal battle with Walter O’Dim, also known as the Man in Black, determined to prevent him from toppling the Dark Tower, which holds the universe together. With the fate of the worlds at stake, good and evil will collide in the ultimate battle as only Roland can defend the Tower from the Man in Black.\",\n" +
            "\t\t\t\"release_date\": \"2017-08-03\",\n" +
            "\t\t\t\"poster_path\": \"/i9GUSgddIqrroubiLsvvMRYyRy0.jpg\",\n" +
            "\t\t\t\"popularity\": 79.77208400000001,\n" +
            "\t\t\t\"title\": \"The Dark Tower\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.7,\n" +
            "\t\t\t\"vote_count\": 768\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/j8wWhGekyBPlgf2viVkptfwOyWi.jpg\",\n" +
            "\t\t\t\"genre_ids\": [80, 18, 9648, 10749, 53],\n" +
            "\t\t\t\"id\": 346685,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Girl on the Train\",\n" +
            "\t\t\t\"overview\": \"Rachel Watson, devastated by her recent divorce, spends her daily commute fantasizing about the seemingly perfect couple who live in a house that her train passes every day, until one morning she sees something shocking happen there and becomes entangled in the mystery that unfolds.\",\n" +
            "\t\t\t\"release_date\": \"2016-10-05\",\n" +
            "\t\t\t\"poster_path\": \"/n8WNMt7stqHUZEE7bEtzK4FwrWe.jpg\",\n" +
            "\t\t\t\"popularity\": 14.667169,\n" +
            "\t\t\t\"title\": \"The Girl on the Train\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.2,\n" +
            "\t\t\t\"vote_count\": 1815\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/hQSGCu45zBNvyXLHtZBRPOwZieT.jpg\",\n" +
            "\t\t\t\"genre_ids\": [99],\n" +
            "\t\t\t\"id\": 392011,\n" +
            "\t\t\t\"original_language\": \"tr\",\n" +
            "\t\t\t\"original_title\": \"Kedi\",\n" +
            "\t\t\t\"overview\": \"A profile of an ancient city and its unique people, seen through the eyes of the most mysterious and beloved animal humans have ever known, the Cat.\",\n" +
            "\t\t\t\"release_date\": \"2017-02-10\",\n" +
            "\t\t\t\"poster_path\": \"/5z2vuJk6P7V2azw3gWQF7L4l5xU.jpg\",\n" +
            "\t\t\t\"popularity\": 4.196697,\n" +
            "\t\t\t\"title\": \"Kedi\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 7.4,\n" +
            "\t\t\t\"vote_count\": 21\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/zLGbK69ZyWPzj5Pgb8tXjDJk8J2.jpg\",\n" +
            "\t\t\t\"genre_ids\": [12, 18],\n" +
            "\t\t\t\"id\": 203819,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Tracks\",\n" +
            "\t\t\t\"overview\": \"Accompanied only by her faithful dog and four camels, an Australian satisfies her craving for solitude by embarking on a solo trip across the desert from Alice Springs to the Indian Ocean.\",\n" +
            "\t\t\t\"release_date\": \"2014-03-06\",\n" +
            "\t\t\t\"poster_path\": \"/ysXVxDpfPvl6YmojfNYDz9zjVtb.jpg\",\n" +
            "\t\t\t\"popularity\": 1.318758,\n" +
            "\t\t\t\"title\": \"Tracks\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 7.0,\n" +
            "\t\t\t\"vote_count\": 190\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/rdKr4rzpAHJXnw55XbOqARNoZhh.jpg\",\n" +
            "\t\t\t\"genre_ids\": [12, 18, 53],\n" +
            "\t\t\t\"id\": 428446,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Walking Out\",\n" +
            "\t\t\t\"overview\": \"A city teen who travels to Montana to go hunting with his estranged father only for the strained trip to become a battle for survival when they encounter a grizzly bear\",\n" +
            "\t\t\t\"release_date\": \"2017-01-21\",\n" +
            "\t\t\t\"poster_path\": \"/wK3l4ZfcRXFph6uop7yr7scM2SP.jpg\",\n" +
            "\t\t\t\"popularity\": 8.150895,\n" +
            "\t\t\t\"title\": \"Walking Out\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.8,\n" +
            "\t\t\t\"vote_count\": 16\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/8ufJoW3aI2VSFRNr7y1F4ntw21B.jpg\",\n" +
            "\t\t\t\"genre_ids\": [35, 27],\n" +
            "\t\t\t\"id\": 346671,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Little Evil\",\n" +
            "\t\t\t\"overview\": \"Gary who has just married Samantha the woman of his dreams, discovers that her six-year-old son may be the Antichrist.\",\n" +
            "\t\t\t\"release_date\": \"2017-08-08\",\n" +
            "\t\t\t\"poster_path\": \"/r3Trvfd5td7JUrIUr5xsDqwNWXJ.jpg\",\n" +
            "\t\t\t\"popularity\": 10.118964,\n" +
            "\t\t\t\"title\": \"Little Evil\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.7,\n" +
            "\t\t\t\"vote_count\": 136\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/2sWXxCc7Y0itpyzqxUFzn0T4QEo.jpg\",\n" +
            "\t\t\t\"genre_ids\": [878, 35, 18, 9648],\n" +
            "\t\t\t\"id\": 426254,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Marjorie Prime\",\n" +
            "\t\t\t\"overview\": \"A service that provides holographic recreations of deceased loved ones and allows a man to come face-to-face with the younger version of his late father-in-law.\",\n" +
            "\t\t\t\"release_date\": \"2017-08-18\",\n" +
            "\t\t\t\"poster_path\": \"/rvTZFjcNvzPFYJnmdrvSrGvqx67.jpg\",\n" +
            "\t\t\t\"popularity\": 5.158118,\n" +
            "\t\t\t\"title\": \"Marjorie Prime\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 5.7,\n" +
            "\t\t\t\"vote_count\": 7\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/d6NHilDfaYgkyqEvP9KEvhxx9o9.jpg\",\n" +
            "\t\t\t\"genre_ids\": [878],\n" +
            "\t\t\t\"id\": 429101,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Anti Matter\",\n" +
            "\t\t\t\"overview\": \"Anti Matter (AKA Worm) is a sci-fi noir take on the Alice in Wonderland tale. Ana, an Oxford PhD student, finds herself unable to build new memories following an experiment to generate and travel through a wormhole. The story follows her increasingly desperate efforts to understand what happened, and to find out who - or what - is behind the rising horror in her life.\",\n" +
            "\t\t\t\"release_date\": \"2016-01-01\",\n" +
            "\t\t\t\"poster_path\": \"/fQq24L8ioUy3cHWPo8LheguicxF.jpg\",\n" +
            "\t\t\t\"popularity\": 6.105789,\n" +
            "\t\t\t\"title\": \"Anti Matter\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 6.7,\n" +
            "\t\t\t\"vote_count\": 22\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/kfOBMcF05qmm4yu293XiZ4iJJKH.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2016-10-15\",\n" +
            "\t\t\t\"genre_ids\": [99],\n" +
            "\t\t\t\"id\": 74398,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Britain's Ancient Tracks with Tony Robinson\",\n" +
            "\t\t\t\"overview\": \"Tony Robinson walks our oldest roads to find the truth behind the megaliths, burial sites, ley lines and hidden caves along their path, and connect the clues they have left hidden in the British landscape.\",\n" +
            "\t\t\t\"origin_country\": [\"GB\"],\n" +
            "\t\t\t\"poster_path\": \"/z645UMyaA1YQBEUWFLwqPoHqPqD.jpg\",\n" +
            "\t\t\t\"popularity\": 1.067492,\n" +
            "\t\t\t\"name\": \"Britain's Ancient Tracks with Tony Robinson\",\n" +
            "\t\t\t\"vote_average\": 0.0,\n" +
            "\t\t\t\"vote_count\": 0\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/cLGKawjQ5tUJCuDyR0OnGYT4fyf.jpg\",\n" +
            "\t\t\t\"genre_ids\": [18, 53, 80],\n" +
            "\t\t\t\"id\": 146233,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"Prisoners\",\n" +
            "\t\t\t\"overview\": \"When Keller Dover's daughter and her friend go missing, he takes matters into his own hands as the police pursue multiple leads and the pressure mounts. But just how far will this desperate father go to protect his family?\",\n" +
            "\t\t\t\"release_date\": \"2013-09-18\",\n" +
            "\t\t\t\"poster_path\": \"/yAhqW57pwMAsCgmZpM5zSIVQVTh.jpg\",\n" +
            "\t\t\t\"popularity\": 22.949052,\n" +
            "\t\t\t\"title\": \"Prisoners\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 7.9,\n" +
            "\t\t\t\"vote_count\": 3160\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/fFMrKQcLPf8NkEjTqiGURPILc2v.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2017-09-28\",\n" +
            "\t\t\t\"genre_ids\": [99],\n" +
            "\t\t\t\"id\": 74309,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"Russia with Simon Reeve\",\n" +
            "\t\t\t\"overview\": \"One hundred years after the Russian Revolution, Simon Reeve embarks on an extraordinary three-part journey across Russia.\",\n" +
            "\t\t\t\"origin_country\": [\"GB\"],\n" +
            "\t\t\t\"poster_path\": \"/lRXV5nzbO5i12PVNap6LY55dYmH.jpg\",\n" +
            "\t\t\t\"popularity\": 4.324258,\n" +
            "\t\t\t\"name\": \"Russia with Simon Reeve\",\n" +
            "\t\t\t\"vote_average\": 8.0,\n" +
            "\t\t\t\"vote_count\": 1\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": \"/36EF5e1ZUJv6xnkOTm5s4vM33SC.jpg\",\n" +
            "\t\t\t\"genre_ids\": [18, 53, 80],\n" +
            "\t\t\t\"id\": 11615,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Life of David Gale\",\n" +
            "\t\t\t\"overview\": \"A man against capital punishment is accused of murdering a fellow activist and is sent to death row.\",\n" +
            "\t\t\t\"release_date\": \"2003-02-21\",\n" +
            "\t\t\t\"poster_path\": \"/pwwDzbmTErcUFUPCV2fGSlHm4WP.jpg\",\n" +
            "\t\t\t\"popularity\": 7.210229,\n" +
            "\t\t\t\"title\": \"The Life of David Gale\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 7.3,\n" +
            "\t\t\t\"vote_count\": 490\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}, {\n" +
            "\t\t\"movie_results\": [{\n" +
            "\t\t\t\"adult\": false,\n" +
            "\t\t\t\"backdrop_path\": null,\n" +
            "\t\t\t\"genre_ids\": [],\n" +
            "\t\t\t\"id\": 390942,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_title\": \"The Eighties\",\n" +
            "\t\t\t\"overview\": \"A documentary series focusing on the Reagan presidency, the AIDS crisis, the end of the Cold War, Wall Street corruption, the tech boom, the expansion of television, and the evolving music industry.\",\n" +
            "\t\t\t\"release_date\": \"2016-03-31\",\n" +
            "\t\t\t\"poster_path\": \"/zyn5C9IIdEJ4bwoSE4NpWapuvvV.jpg\",\n" +
            "\t\t\t\"popularity\": 1.632171,\n" +
            "\t\t\t\"title\": \"The Eighties\",\n" +
            "\t\t\t\"video\": false,\n" +
            "\t\t\t\"vote_average\": 8.0,\n" +
            "\t\t\t\"vote_count\": 1\n" +
            "\t\t}],\n" +
            "\t\t\"person_results\": [],\n" +
            "\t\t\"tv_results\": [{\n" +
            "\t\t\t\"backdrop_path\": \"/eugeu0zAMUNwxrF1t8WpdzpEId7.jpg\",\n" +
            "\t\t\t\"first_air_date\": \"2016-03-31\",\n" +
            "\t\t\t\"genre_ids\": [99],\n" +
            "\t\t\t\"id\": 66482,\n" +
            "\t\t\t\"original_language\": \"en\",\n" +
            "\t\t\t\"original_name\": \"The Eighties\",\n" +
            "\t\t\t\"overview\": \"The third installment from executive producers Tom Hanks, Gary Goetzman and Mark Herzog, following in the footsteps of critically-acclaimed series \\\"The Sixties\\\" and \\\"The Seventies,\\\" tackles 10 years shaped by exceptionalism and excess. Like its predecessors, \\\"The Eighties\\\" intersperses rare archival newsreel footage, interviews, and comments by historians, journalists, politicians, celebrities and others, painting a perspective-rich picture of a vibrant decade. Episodes examine the age of Reagan, the AIDS crisis, the end of the Cold War, Wall Street corruption, the evolving TV and music scene, and everything in between.\",\n" +
            "\t\t\t\"origin_country\": [\"US\"],\n" +
            "\t\t\t\"poster_path\": \"/oL7pMz3XbR8VGFLpFRlxqDnkrga.jpg\",\n" +
            "\t\t\t\"popularity\": 1.128445,\n" +
            "\t\t\t\"name\": \"The Eighties\",\n" +
            "\t\t\t\"vote_average\": 8.800000000000001,\n" +
            "\t\t\t\"vote_count\": 2\n" +
            "\t\t}],\n" +
            "\t\t\"tv_episode_results\": [],\n" +
            "\t\t\"tv_season_results\": []\n" +
            "\t}]\n" +
            "}";
}
