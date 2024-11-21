package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateHttpGeoIpRuleRequestBody
 */
public class UpdateHttpGeoIpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo_ip")

    private String geoIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    public UpdateHttpGeoIpRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateHttpGeoIpRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最长512字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateHttpGeoIpRuleRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则开关状态
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateHttpGeoIpRuleRequestBody withGeoIp(String geoIp) {
        this.geoIp = geoIp;
        return this;
    }

    /**
     * 地理位置封禁区域，选择区域对应的字母代号,用中划线|分隔： （北京：CN_BJ，上海：CN_SH，天津：CN_TJ，重庆：CN_CQ，广东：CN_GD，浙江：CN_ZJ，江苏：CN_JS，福建：CN_FJ，吉林：CN_JL，辽宁：CN_LN，台湾：CN_TW，贵州：CN_GZ，安徽：CN_AH，黑龙江：CN_HL，河南：CN_HA，四川：CN_SC，河北：CN_HE，云南：CN_YN，湖北：CN_HB，海南：CN_HI，青海：CN_QH，湖南：CN_HN，江西：CN_JX，山西：CN_SX，陕西：CN_SN，甘肃：CN_GS，山东：CN_SD，澳门：CN_MO，香港：CN_HK，宁夏：CN_NX，广西：CN_GX，新疆：CN_XJ，西藏：CN_XZ，内蒙古：CN_NM，印度：IN，美国：US，印度尼西亚：ID，巴基斯坦：PK，巴西：BR，尼日利亚：NG，孟加拉国：BD，俄罗斯联邦：RU，日本：JP，墨西哥：MX，埃塞俄比亚：ET，菲律宾：PH，埃及：EG，越南：VN，德国：DE，土耳其：TR，泰国：TH，法国：FR，英国：GB，意大利：IT，南非：ZA，缅甸：MM，肯尼亚：KE，坦桑尼亚：TZ，哥伦比亚：CO，西班牙：ES，乌克兰：UA，伊拉克：IQ，波兰：PL，沙特阿拉伯：SA，秘鲁：PE，乌干达：UG，马来西亚：MY，苏丹：SD，罗马尼亚：RO，阿富汗：AF，加拿大：CA，摩洛哥：MA，智利：CL，刚果（金）：CD，伊朗：IR，韩国：KR，安哥拉：AO，加纳：GH，莫桑比克：MZ，阿根廷：AR，阿尔及利亚：DZ，尼泊尔：NP，马达加斯加：MG，朝鲜：KP，喀麦隆：CM，科特迪瓦：CI，澳大利亚：AU，荷兰：NL，尼日尔：NE，斯里兰卡：LK，布基纳法索：BF，乌兹别克斯坦：UZ，马里：ML，委内瑞拉：VE，哈萨克斯坦：KZ，马拉维：MW，赞比亚：ZM，也门：YE，比利时：BE，危地马拉：GT，叙利亚：SY，厄瓜多尔：EC，塞内加尔：SN，乍得：TD，索马里：SO，津巴布韦：ZW，几内亚：GN，卢旺达：RW，突尼斯：TN，贝宁：BJ，捷克：CZ，玻利维亚：BO，古巴：CU，布隆迪：BI，海地：HT，柬埔寨：KH，希腊：GR，多米尼加：DO，瑞典：SE，葡萄牙：PT，约旦：JO，南苏丹：SS，阿塞拜疆：AZ，匈牙利：HU，阿联酋：AE，洪都拉斯：HN，白俄罗斯：BY，塔吉克斯坦：TJ，以色列：IL，奥地利：AT，巴布亚新几内亚：PG，瑞士：CH，多哥：TG，塞拉利昂：SL，老挝：LA，保加利亚：BG，塞尔维亚：RS，巴拉圭：PY，黎巴嫩：LB，利比亚：LY，尼加拉瓜：NI，萨尔瓦多：SV，吉尔吉斯斯坦：KG，土库曼斯坦：TM，丹麦：DK，新加坡：SG，芬兰：FI，斯洛伐克：SK，挪威：NO，刚果（布）：CG，哥斯达黎加：CR，新西兰：NZ，爱尔兰：IE，阿曼：OM，利比里亚：LR，中非：CF，巴勒斯坦：PS，毛利塔尼亚：MR，巴拿马：PA，科威特：KW，克罗地亚：HR，格鲁吉亚：GE，摩尔多瓦：MD，乌拉圭：UY，波黑：BA，波多黎各：PR，蒙古：MN，亚美尼亚：AM，牙买加：JM，阿尔巴尼亚：AL，立陶宛：LT，卡塔尔：QA，纳米比亚：NA，冈比亚：GM，博茨瓦纳：BW，加蓬：GA，莱索托：LS，前南马其顿：MK，斯洛文尼亚：SI，拉脱维亚：LV，几内亚比绍：GW，科索沃：XK，巴林：BH，特立尼达和多巴哥：TT，爱沙尼亚：EE，赤道几内亚：GQ，东帝汶：TL，毛里求斯：MU，塞浦路斯：CY，斯威士兰：SZ，吉布提：DJ，斐济：FJ，留尼汪：RE，科摩罗：KM，圭亚那：GY，不丹：BT，所罗门群岛：SB，黑山：ME，卢森堡：LU，苏里南：SR，佛得角：CV，马尔代夫：MV，西撒哈拉：EH，马耳他：MT，文莱：BN，瓜德罗普：GP，巴哈马：BS，伯利兹：BZ，马提尼克：MQ，冰岛：IS，法属圭亚那：GF，瓦努阿图：VU，巴巴多斯：BB，新喀里多尼亚：NC，法属波利尼西亚：PF，马约特：YT，荷属安的列斯：AN，圣多美和普林西比：ST，萨摩亚：WS，圣卢西亚：LC，关岛：GU，库拉索：CW，基里巴斯：KI，密克罗尼西亚联邦：FM，格林纳达：GD，圣文森特和格林纳丁斯：VC，美属维尔京群岛：VI，泽西岛：JE，阿鲁巴：AW，汤加：TO，塞舌尔：SC，安提瓜和巴布达：AG，英国属地曼岛：IM，安道尔：AD，多米尼克：DM，开曼群岛：KY，百慕大：BM，格恩西岛：GG，马绍尔群岛：MH，北马里亚纳：MP，格陵兰：GL，美属萨摩亚：AS，圣基茨和尼维斯：KN，法罗群岛：FO，荷属圣马丁：SX，摩纳哥：MC，列支敦士登：LI，特克斯和凯科斯群岛：TC，法属圣马丁：MF，圣马力诺：SM，直布罗陀：GI，英属维尔京群岛：VG，奥兰群岛：AX，博奈尔：BQ，帕劳：PW，库克群岛：CK，安圭拉：AI，瑙鲁：NR，瓦利斯和富图纳：WF，图瓦卢：TV，圣巴泰勒米：BL，圣皮埃尔和密克隆：PM，蒙特塞拉特：MS，圣赫勒拿：SH，福克兰群岛（马尔维纳斯）：FK，诺福克岛：NF，纽埃：NU，托克劳：TK，圣诞岛：CX，梵蒂冈：VA，科科斯（基林）群岛：CC，美国本土外小岛屿：UM，皮特凯恩：PN，南乔治亚岛和南桑德韦奇岛：GS，南极洲：AQ，布维岛：BV，厄立特里亚：ER，赫德岛和麦克唐纳岛：HM，英属印度洋领地：IO，法属南部领地：TF，斯瓦尔巴岛和扬马延岛：SJ）
     * @return geoIp
     */
    public String getGeoIp() {
        return geoIp;
    }

    public void setGeoIp(String geoIp) {
        this.geoIp = geoIp;
    }

    public UpdateHttpGeoIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0 拦截  - 1 放行  - 2 仅记录
     * minimum: 0
     * maximum: 2
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpGeoIpRuleRequestBody that = (UpdateHttpGeoIpRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.geoIp, that.geoIp)
            && Objects.equals(this.white, that.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, status, geoIp, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpGeoIpRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    geoIp: ").append(toIndentedString(geoIp)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
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
