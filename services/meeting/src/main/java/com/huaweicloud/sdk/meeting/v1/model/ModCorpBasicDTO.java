package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 待修改的企业基本信息，不带或参数null，则不修改
 */
public class ModCorpBasicDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="country")
    
    private String country;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fax")
    
    private String fax;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ModCorpBasicDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 企业名称，格式必须满足^[^#%&'+;<>=\"'？?\\\\……/]*$
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModCorpBasicDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * 手机号，必须加上国家码，例如中国大陆手机+86xxxxxxx，当填写手机号时 “country”参数必填,手机格式必须满足(^$|^[+]?[0-9]+$)
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ModCorpBasicDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    


    /**
     * 手机号所属的国家, 如果国家为中国大陆则country参数取值为chinaPR,国家和国家码的对应关系如下chinaPR: +86(中国大陆); chinaHKG: +852（中国香港）; chinaOMA: +853(中国澳门);  chinaTPE: +886(中国台湾地区); BVl: +1284 (英属维尔京群岛); Bolivia: +591(玻利维亚); CZ: +420(捷克共和国); GB: +245(几内亚比绍); SVGrenadines: +1784(圣文森特和格林纳丁斯); TAT: +1868(特立尼达和多巴哥); UK: +44(英国); afghanistan: +93(阿富汗); albania: +355(阿尔巴尼亚); algeria: +213(阿尔及利亚); andorra: +376(安道尔共和国); angola: +244(安哥拉); argentina: +54(阿根廷); armenia: +374(亚美尼亚); australia: +61(澳大利亚); austria: +43(奥地利); azerbaijan: +994(阿塞拜疆); bahamas: +1242(巴哈马); bahrain: +973(巴林); bangladesh: +880(孟加拉国); belarus: +375(白俄罗斯); belgium: +32(比利时); belize: +501(伯利兹); benin: +229(贝宁); bosniaAndHerzegovina: +387(波斯尼亚和黑塞哥维那); botswana: +267(博茨瓦纳); brazil: +55(巴西); brunei: +673(文莱); bulgaria: +359(保加利亚); burkinaFaso: +226(布基纳法索); burundi: +257(布隆迪); cambodia: +855(柬埔寨); cameroon: +237(喀麦隆); canada: +1(加拿大); capeVerde: +238(佛得角); caymanIslands: +1345(开曼群岛); centralAfrican: +236(中非); chad: +235(乍得); chile: +56(智利);  columbia: +57(哥伦比亚); comoros: +269(科摩罗); congoB: +242(刚果.布); congoJ: +243(刚果.金); costarica: +506(哥斯达黎加); croatia: +385(克罗地亚); curacao: +599(库拉索岛); cyprus: +357(塞浦路斯); denmark: +45(丹麦); djibouti: +253(吉布提); dominica: +1809(多米尼加共和国); ecuador: +593(厄瓜多尔); egypt: +20(埃及); equatorialGuinea: +240(赤道几内亚); estonia: +372(爱沙尼亚); finland: +358(芬兰); france: +33(法国); gabon: +241(加蓬); gambia: +220(冈比亚); georgia: +995(格鲁吉亚); germany: +49(德国); ghana: +233(加纳); greece: +30(希腊); grenada: +1473(格林纳达); guatemala: +502(危地马拉); guinea: +224(几内亚); guyana: +592(圭亚那); honduras: +504(洪都拉斯); hungary: +36(匈牙利); india: +91(印度); indonesia: +62(印度尼西亚); iraq: +964(伊拉克); ireland: +353(爱尔兰); israel: +972( 以色列); italy: +39(意大利); ivoryCoast: +225(科特迪瓦); jamaica: +1876(牙买加); japan: +81(日本); jordan: +962(约旦); kazakhstan: +7(哈萨克斯坦); kenya: +254(肯尼亚); kosovo: +383(科索沃); kuwait: +965(科威特); kyrgyzstan: +996(吉尔吉斯斯坦); laos: +856(老挝); latvia: +371(拉脱维亚); lebanon: +961(黎巴嫩); lesotho: +266(莱索托); liberia: +231(利比里亚); libya: +218(利比亚); lithuania: +370(立陶宛); luxembourg: +352(卢森堡); macedonia: +389(马其顿); madagascar: +261(马达加斯加); malawi: +265(马拉维); malaysia: +60(马来西亚); maldives: +960(马尔代夫); mali: +223(马里); malta: +356(马耳他); mauritania: +222(毛里塔尼亚); mauritius: +230(毛里求斯); mexico: +52(墨西哥); moldova: +373(摩尔多瓦); mongolia: +976(蒙古); montenegro: +382 (黑山共和国); morocco: +212(摩洛哥); mozambique: +258(莫桑比克); myanmar: +95(缅甸); namibia: +264(纳米比亚); nepal: +977(尼泊尔); netherlands: +31(荷兰); newZealand: +64(新西兰); nicaragua: +505(尼加拉瓜); niger: +227(尼日尔); nigeria: +234(尼日利亚); norway: +47(挪威); oman: +968(阿曼); pakistan: +92(巴基斯坦); palestine: +970(巴勒斯坦); panama: +507(巴拿马); papuaNewGuinea: +675(巴布亚新几内亚); peru: +51(秘鲁); philippines: +63(菲律宾); poland: +48(波兰); portugal: +351(葡萄牙); puertoRico: +1787(波多黎各); qatar: +974(卡塔尔); romania: +40(罗马尼亚); russia: +7(俄罗斯); rwanda: +250(卢旺达); saintMartin: +590(圣马丁); salvatore: +503(萨尔瓦多); saudiArabia: +966(沙特阿拉伯); senegal: +221(塞内加尔); serbia: +381(塞尔维亚); seychelles: +248(塞舌尔); sierraLeone: +232(塞拉利昂); singapore: +65(新加坡); slovakia: +421(斯洛伐克); slovenia: +386(斯洛文尼亚); somalia: +252(索马里); southAfrica: +27(南非); southKorea: +82(韩国); spain: +34(西班牙); sriLanka: +94(斯里兰卡); suriname: +597(苏里南); swaziland: +268(斯威士兰); sweden: +46(瑞典); switzerland: +41(瑞士); tajikistan: +992(塔吉克斯坦); tanzania: +255(坦桑尼亚); thailand: +66(泰国); togo: +228(多哥); tunisia: +216(突尼斯); turkey: +90(土耳其); turkmenistan: +993(土库曼斯坦); uae: +971(阿联酋); uganda: +256(乌干达); ukraine: +380(乌克兰); uruguay: +598(乌拉圭); usa: +1(美国); uzbekistan: +998(乌兹别克斯坦); venezuela: +58(委内瑞拉); vietNam: +84(越南); yemen: +967(也门); zambia: +260(赞比亚); zimbabwe: +263(津巴布韦)
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ModCorpBasicDTO withFax(String fax) {
        this.fax = fax;
        return this;
    }

    


    /**
     * 传真号码,格式必须满足(^$|^[+]?[0-9]+$)
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public ModCorpBasicDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * 邮箱地址,格式必须满足(^$|^[\\w-+]+(\\.[\\w-+]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[\\w-]{1,})$)
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ModCorpBasicDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ModCorpBasicDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModCorpBasicDTO modCorpBasicDTO = (ModCorpBasicDTO) o;
        return Objects.equals(this.name, modCorpBasicDTO.name) &&
            Objects.equals(this.phone, modCorpBasicDTO.phone) &&
            Objects.equals(this.country, modCorpBasicDTO.country) &&
            Objects.equals(this.fax, modCorpBasicDTO.fax) &&
            Objects.equals(this.email, modCorpBasicDTO.email) &&
            Objects.equals(this.address, modCorpBasicDTO.address) &&
            Objects.equals(this.description, modCorpBasicDTO.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, phone, country, fax, email, address, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModCorpBasicDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

