import android.app.Application;

import com.github.catvod.spider.DaGongRen;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Libvio;
import com.github.catvod.utils.Json;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(RobolectricTestRunner.class)
public class LibvioTest {
    // @Mock
    private Application mockContext;

    private Libvio spider;

    @org.junit.Before
    public void setUp() throws Exception {
        mockContext = RuntimeEnvironment.application;
        Init.init(mockContext);
        spider = new Libvio();
        spider.init(mockContext, "{\"site\": \"https://www.libvio.app\" ,\"cookie\":\"b-user-id=89ede34e-0efc-e1dd-c997-f16aaa792d0c; _UP_A4A_11_=wb9661c6dfb642f88f73d8e0c7edd398; b-user-id=89ede34e-0efc-e1dd-c997-f16aaa792d0c; ctoken=wla6p3EUOLyn1FSB8IKp1SEW; grey-id=5583e32b-39df-4bf0-f39f-1adf83f604a2; grey-id.sig=p8ReBIMG2BeZu1sYvsuOAZxYbx-MVrsfKEiCv87MsTM; isQuark=true; isQuark.sig=hUgqObykqFom5Y09bll94T1sS9abT1X-4Df_lzgl8nM; _UP_F7E_8D_=ZkyvVHnrBLp1A1NFJIjWi0PwKLOVbxJPcg0RzQPI6KmBtV6ZMgPh38l93pgubgHDQqhaZ2Sfc0qv%2BRantbfg1mWGAUpRMP4RqXP78Wvu%2FCfvkWWGc5NhCTV71tGOIGgDBR3%2Bu6%2Fjj44KlE5biSNDOWW7Bigcz27lvOTidzNw8s%2FWtKAIxWbnCzZn4%2FJMBUub1SIMcW89g57k4mfPmDlCgpZKzxwl6beSfdtZ4RUWXmZOn5v5NkxVKhU4wR0Pq7NklczEGdRq2nIAcu7v22Uw2o%2FxMY0xBdeC9Korm5%2FNHnxl6K%2Bd6FXSoT9a3XIMQO359auZPiZWzrNlZe%2BqnOahXcx7KAhQIRqSOapSmL4ygJor4r5isJhRuDoXy7vJAVuH%2FRDtEJJ8rZTq0BdC23Bz%2B0MrsdgbK%2BiW; _UP_D_=pc; __wpkreporterwid_=3d3f74a7-99b7-4916-3f78-911fc2eb9d87; tfstk=fIoZNxjnbhKwPOu0TWZ4LsaRqirTcudSSmNbnxD0C5VgClMm8xMyB-GsnSu4tjpOflAOmSD-9PNiGl120XrgkVNb1SrqHbJBN3tSBAEYoQOWVUUg9qZ8n1bGGkD3CqGYINKSBABhjnXgp3_Vywz6gSc0Syj3BWf0mr2DLW24eZfiiovEKWefj1q0swq3E82iNEMinMy7SLrcpA4Fh3z_ZAViCfih3PbtdW5N_DuU77AaTijmYRkL2Wq54ENoy5a7ZXxCbok33XzS7QSZgxD-oyoVsdGotql0p2dVu7umC4nLStbiLmParc4FELHrI-c0u2dPVRrs8zoZWKCnIbNZrlHfUCMUz2z8KyXVSlgSFmUojh58OzeqTzgwaGll4YCYKwctDV5coP2LL79eKHxpNTXHmre1kZU32JPWCR_AkP2LL79eLZQY-WeUNdw1.; __pus=2051c82285199d8be553be41dd5a2100AAQ+mmv35G4FDDZ5x+3Mhe2OMbNgweQ1ODbW8zDt9YuP1LQVqHUuAAz9KWLsPjpNtim0AVGHusN4MCosTmbq/khM; __kp=e6604120-6051-11ef-bfe4-c31b6cdd0766; __kps=AATcZArVgS76EPn0FMaV4HEj; __ktd=sii/iz4ePzEaoVirXul7QQ==; __uid=AATcZArVgS76EPn0FMaV4HEj; __itrace_wid=5829b95d-dac1-48d3-bfd5-f60cd9462786; __puus=7da0b96cb710fa1b376934485f977e05AATp/q8/QupT7IiBR1GWqZhxlIRT677smMvoHlLxQA0Lk6CkP0YJBOTl+p9DZgzlMz6w4hPXPgWsokukk8PW7ZfhFfPmv8tKMgLpCGLW+tk57luhNghmSdTeVPkAF59STtyCPBEtiNzNAd/zZJ6qILJDi5ywEBAAAg+gOyWHoLHNUR+QxeHRuQa8g5WWA95J8jebIlrr8rCvI1vjTbtiYktT\",\"token\":\"26fc6787afff43e78b78992e782502f1\"}");



    }

    @org.junit.Test
    public void homeContent() throws Exception {
        String content = spider.homeContent(true);
        JsonObject map = Json.safeObject(content);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("homeContent--" + gson.toJson(map));

        //Assert.assertFalse(map.getAsJsonArray("list").isEmpty());
    }

    @org.junit.Test
    public void homeVideoContent() throws Exception {
        String content = spider.homeVideoContent();
        JsonObject map = Json.safeObject(content);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("homeVideoContent--" + gson.toJson(map));

        //Assert.assertFalse(map.getAsJsonArray("list").isEmpty());
    }

    @org.junit.Test
    public void categoryContent() throws Exception {
        String content = spider.categoryContent("/type/1", "2", true, null);
        JsonObject map = Json.safeObject(content);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("categoryContent--" + gson.toJson(map));
        Assert.assertFalse(map.getAsJsonArray("list").isEmpty());
    }

    @org.junit.Test
    public void detailContent() throws Exception {

        String content = spider.detailContent(Arrays.asList("714891892.html"));
        System.out.println("detailContent--" + content);

        JsonObject map = Json.safeObject(content);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("detailContent--" + gson.toJson(map));
        Assert.assertFalse(map.getAsJsonArray("list").isEmpty());
    }

    @org.junit.Test
    public void playerContent() throws Exception {
        String froms = "HD播放$$$quark4K#01$$$quark超清#01$$$quark高清#01$$$quark普画#01";
        String urls = "第01集$714891892-2-1.html#第02集$714891892-2-2.html$$$女巫阿加莎S01E01.mp4 873.45MB$1392fbcf2dd440f39ab91613c8a11bbf++fd658a5a021be6b9f2a5a701cb19467a++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mp4 908.26MB$0554004cf0d94840a7cd567a34d5a400++9ea8ab7fa561f537e0573ae04d32b74c++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E01.mkv 1.68GB$a938f4ca7ede4afbb35844edc97ef338++2c17995abfd9e4d4d239652179518480++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mkv 1.59GB$1b69a4c0ef2b46a281dbf616f0d1bea6++217e94c28c7fa60ae556d1a1fbcc48f9++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=$$$女巫阿加莎S01E01.mp4 873.45MB$1392fbcf2dd440f39ab91613c8a11bbf++fd658a5a021be6b9f2a5a701cb19467a++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mp4 908.26MB$0554004cf0d94840a7cd567a34d5a400++9ea8ab7fa561f537e0573ae04d32b74c++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E01.mkv 1.68GB$a938f4ca7ede4afbb35844edc97ef338++2c17995abfd9e4d4d239652179518480++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mkv 1.59GB$1b69a4c0ef2b46a281dbf616f0d1bea6++217e94c28c7fa60ae556d1a1fbcc48f9++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=$$$女巫阿加莎S01E01.mp4 873.45MB$1392fbcf2dd440f39ab91613c8a11bbf++fd658a5a021be6b9f2a5a701cb19467a++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mp4 908.26MB$0554004cf0d94840a7cd567a34d5a400++9ea8ab7fa561f537e0573ae04d32b74c++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E01.mkv 1.68GB$a938f4ca7ede4afbb35844edc97ef338++2c17995abfd9e4d4d239652179518480++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mkv 1.59GB$1b69a4c0ef2b46a281dbf616f0d1bea6++217e94c28c7fa60ae556d1a1fbcc48f9++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=$$$女巫阿加莎S01E01.mp4 873.45MB$1392fbcf2dd440f39ab91613c8a11bbf++fd658a5a021be6b9f2a5a701cb19467a++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mp4 908.26MB$0554004cf0d94840a7cd567a34d5a400++9ea8ab7fa561f537e0573ae04d32b74c++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E01.mkv 1.68GB$a938f4ca7ede4afbb35844edc97ef338++2c17995abfd9e4d4d239652179518480++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=#女巫阿加莎S01E02.mkv 1.59GB$1b69a4c0ef2b46a281dbf616f0d1bea6++217e94c28c7fa60ae556d1a1fbcc48f9++4190fba22ff8++AssrQOfAvLi5VRwpv6zsXKP+AV2nAaThcsYmZYTr85g=";
        for (int i = 0; i < urls.split("\\$\\$\\$").length; i++) {
            String content = spider.playerContent(froms.split("\\$\\$\\$")[i], urls.split("\\$\\$\\$")[i].split("#")[0].split("\\$")[1], new ArrayList<>());
            JsonObject map = Json.safeObject(content);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("playerContent--" + gson.toJson(map));
            Assert.assertFalse(map.getAsJsonPrimitive("url").getAsString().isEmpty());
        }
    }

    @org.junit.Test
    public void searchContent() throws Exception {
        String content = spider.searchContent("唐朝", false);
        JsonObject map = Json.safeObject(content);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("searchContent--" + gson.toJson(map));
        Assert.assertFalse(map.getAsJsonArray("list").isEmpty());
    }
}