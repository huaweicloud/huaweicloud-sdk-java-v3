package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListThreatsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xss")
    
    private Integer xss;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sqli")
    
    private Integer sqli;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cmdi")
    
    private Integer cmdi;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lfi")
    
    private Integer lfi;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rfi")
    
    private Integer rfi;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="webshell")
    
    private Integer webshell;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="robot")
    
    private Integer robot;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cc")
    
    private Integer cc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom")
    
    private Integer custom;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whiteblackip")
    
    private Integer whiteblackip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="antileakage")
    
    private Integer antileakage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="antitamper")
    
    private Integer antitamper;

    public ListThreatsResponse withXss(Integer xss) {
        this.xss = xss;
        return this;
    }

    


    /**
     * 时间区间内xss攻击数量
     * @return xss
     */
    public Integer getXss() {
        return xss;
    }

    public void setXss(Integer xss) {
        this.xss = xss;
    }

    

    public ListThreatsResponse withSqli(Integer sqli) {
        this.sqli = sqli;
        return this;
    }

    


    /**
     * 时间区间内sqli攻击数量
     * @return sqli
     */
    public Integer getSqli() {
        return sqli;
    }

    public void setSqli(Integer sqli) {
        this.sqli = sqli;
    }

    

    public ListThreatsResponse withCmdi(Integer cmdi) {
        this.cmdi = cmdi;
        return this;
    }

    


    /**
     * 时间区间内cmdi攻击数量
     * @return cmdi
     */
    public Integer getCmdi() {
        return cmdi;
    }

    public void setCmdi(Integer cmdi) {
        this.cmdi = cmdi;
    }

    

    public ListThreatsResponse withLfi(Integer lfi) {
        this.lfi = lfi;
        return this;
    }

    


    /**
     * 时间区间内lfi攻击数量
     * @return lfi
     */
    public Integer getLfi() {
        return lfi;
    }

    public void setLfi(Integer lfi) {
        this.lfi = lfi;
    }

    

    public ListThreatsResponse withRfi(Integer rfi) {
        this.rfi = rfi;
        return this;
    }

    


    /**
     * 时间区间内rfi攻击数量
     * @return rfi
     */
    public Integer getRfi() {
        return rfi;
    }

    public void setRfi(Integer rfi) {
        this.rfi = rfi;
    }

    

    public ListThreatsResponse withWebshell(Integer webshell) {
        this.webshell = webshell;
        return this;
    }

    


    /**
     * 时间区间内webshell攻击数量
     * @return webshell
     */
    public Integer getWebshell() {
        return webshell;
    }

    public void setWebshell(Integer webshell) {
        this.webshell = webshell;
    }

    

    public ListThreatsResponse withRobot(Integer robot) {
        this.robot = robot;
        return this;
    }

    


    /**
     * 时间区间内恶意爬虫数量
     * @return robot
     */
    public Integer getRobot() {
        return robot;
    }

    public void setRobot(Integer robot) {
        this.robot = robot;
    }

    

    public ListThreatsResponse withCc(Integer cc) {
        this.cc = cc;
        return this;
    }

    


    /**
     * 时间区间内cc攻击数量
     * @return cc
     */
    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    

    public ListThreatsResponse withCustom(Integer custom) {
        this.custom = custom;
        return this;
    }

    


    /**
     * 时间区间内对自定义规则攻击数量
     * @return custom
     */
    public Integer getCustom() {
        return custom;
    }

    public void setCustom(Integer custom) {
        this.custom = custom;
    }

    

    public ListThreatsResponse withWhiteblackip(Integer whiteblackip) {
        this.whiteblackip = whiteblackip;
        return this;
    }

    


    /**
     * 时间区间内对黑白名单规则攻击数量
     * @return whiteblackip
     */
    public Integer getWhiteblackip() {
        return whiteblackip;
    }

    public void setWhiteblackip(Integer whiteblackip) {
        this.whiteblackip = whiteblackip;
    }

    

    public ListThreatsResponse withAntileakage(Integer antileakage) {
        this.antileakage = antileakage;
        return this;
    }

    


    /**
     * 时间区间内反泄漏数量
     * @return antileakage
     */
    public Integer getAntileakage() {
        return antileakage;
    }

    public void setAntileakage(Integer antileakage) {
        this.antileakage = antileakage;
    }

    

    public ListThreatsResponse withAntitamper(Integer antitamper) {
        this.antitamper = antitamper;
        return this;
    }

    


    /**
     * 时间区间内防篡改数量
     * @return antitamper
     */
    public Integer getAntitamper() {
        return antitamper;
    }

    public void setAntitamper(Integer antitamper) {
        this.antitamper = antitamper;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListThreatsResponse listThreatsResponse = (ListThreatsResponse) o;
        return Objects.equals(this.xss, listThreatsResponse.xss) &&
            Objects.equals(this.sqli, listThreatsResponse.sqli) &&
            Objects.equals(this.cmdi, listThreatsResponse.cmdi) &&
            Objects.equals(this.lfi, listThreatsResponse.lfi) &&
            Objects.equals(this.rfi, listThreatsResponse.rfi) &&
            Objects.equals(this.webshell, listThreatsResponse.webshell) &&
            Objects.equals(this.robot, listThreatsResponse.robot) &&
            Objects.equals(this.cc, listThreatsResponse.cc) &&
            Objects.equals(this.custom, listThreatsResponse.custom) &&
            Objects.equals(this.whiteblackip, listThreatsResponse.whiteblackip) &&
            Objects.equals(this.antileakage, listThreatsResponse.antileakage) &&
            Objects.equals(this.antitamper, listThreatsResponse.antitamper);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xss, sqli, cmdi, lfi, rfi, webshell, robot, cc, custom, whiteblackip, antileakage, antitamper);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListThreatsResponse {\n");
        sb.append("    xss: ").append(toIndentedString(xss)).append("\n");
        sb.append("    sqli: ").append(toIndentedString(sqli)).append("\n");
        sb.append("    cmdi: ").append(toIndentedString(cmdi)).append("\n");
        sb.append("    lfi: ").append(toIndentedString(lfi)).append("\n");
        sb.append("    rfi: ").append(toIndentedString(rfi)).append("\n");
        sb.append("    webshell: ").append(toIndentedString(webshell)).append("\n");
        sb.append("    robot: ").append(toIndentedString(robot)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    whiteblackip: ").append(toIndentedString(whiteblackip)).append("\n");
        sb.append("    antileakage: ").append(toIndentedString(antileakage)).append("\n");
        sb.append("    antitamper: ").append(toIndentedString(antitamper)).append("\n");
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

