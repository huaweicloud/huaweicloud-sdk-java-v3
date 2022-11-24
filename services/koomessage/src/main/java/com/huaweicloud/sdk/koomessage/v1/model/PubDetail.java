package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务号详情。
 */
public class PubDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_time")

    private String operTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_time")

    private String onlineTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_img")

    private String logoImg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_url")

    private String logoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_files")

    private Map<String, String> authorizationFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_get_port")

    private Integer autoGetPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "industry")

    private Integer industry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_abstract")

    private String pubAbstract;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signs_for_auto_get_port")

    private List<String> signsForAutoGetPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_id")

    private String companyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_remark")

    private String pubRemark;

    public PubDetail withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public PubDetail withOperTime(String operTime) {
        this.operTime = operTime;
        return this;
    }

    /**
     * 最新操作时间，格式：yyyy-MM-ddTHH:mm:ssZ。
     * @return operTime
     */
    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }

    public PubDetail withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 服务号状态。  - 1：未生效 - 2：已生效 - 3：已失效 - 4：已冻结  
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public PubDetail withOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
        return this;
    }

    /**
     * 上线时间，格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return onlineTime
     */
    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public PubDetail withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 企业名称。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public PubDetail withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public PubDetail withLogoImg(String logoImg) {
        this.logoImg = logoImg;
        return this;
    }

    /**
     * 服务号LOGO图片资源ID。
     * @return logoImg
     */
    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public PubDetail withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * 服务号LOGO图片URL。
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public PubDetail withAuthorizationFiles(Map<String, String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
        return this;
    }

    public PubDetail putAuthorizationFilesItem(String key, String authorizationFilesItem) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new HashMap<>();
        }
        this.authorizationFiles.put(key, authorizationFilesItem);
        return this;
    }

    public PubDetail withAuthorizationFiles(Consumer<Map<String, String>> authorizationFilesSetter) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new HashMap<>();
        }
        authorizationFilesSetter.accept(this.authorizationFiles);
        return this;
    }

    /**
     * 授权证明图片的OBSURL地址。
     * @return authorizationFiles
     */
    public Map<String, String> getAuthorizationFiles() {
        return authorizationFiles;
    }

    public void setAuthorizationFiles(Map<String, String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
    }

    public PubDetail withAutoGetPort(Integer autoGetPort) {
        this.autoGetPort = autoGetPort;
        return this;
    }

    /**
     * 是否授权系统自动收集端口。   - 0：否  - 1：是  
     * @return autoGetPort
     */
    public Integer getAutoGetPort() {
        return autoGetPort;
    }

    public void setAutoGetPort(Integer autoGetPort) {
        this.autoGetPort = autoGetPort;
    }

    public PubDetail withIndustry(Integer industry) {
        this.industry = industry;
        return this;
    }

    /**
     * 从事行业，默认取服务号所属商家的行业分类。  - 1：金融理财  - 2：社交通讯  - 3：影音娱乐  - 4：旅游出行  - 5：购物  - 6：本地生活  - 7：运动健康  - 8：教育培训  - 9：新闻阅读  - 10：运营商  - 11：其他  
     * @return industry
     */
    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public PubDetail withPubAbstract(String pubAbstract) {
        this.pubAbstract = pubAbstract;
        return this;
    }

    /**
     * 服务号简介。
     * @return pubAbstract
     */
    public String getPubAbstract() {
        return pubAbstract;
    }

    public void setPubAbstract(String pubAbstract) {
        this.pubAbstract = pubAbstract;
    }

    public PubDetail withSignsForAutoGetPort(List<String> signsForAutoGetPort) {
        this.signsForAutoGetPort = signsForAutoGetPort;
        return this;
    }

    public PubDetail addSignsForAutoGetPortItem(String signsForAutoGetPortItem) {
        if (this.signsForAutoGetPort == null) {
            this.signsForAutoGetPort = new ArrayList<>();
        }
        this.signsForAutoGetPort.add(signsForAutoGetPortItem);
        return this;
    }

    public PubDetail withSignsForAutoGetPort(Consumer<List<String>> signsForAutoGetPortSetter) {
        if (this.signsForAutoGetPort == null) {
            this.signsForAutoGetPort = new ArrayList<>();
        }
        signsForAutoGetPortSetter.accept(this.signsForAutoGetPort);
        return this;
    }

    /**
     * 自动收集端口使用的签名列表。  > auto_get_port为1时，该字段为必填，每个签名长度为2-18个字符，每个服务号签名不可以重复。 
     * @return signsForAutoGetPort
     */
    public List<String> getSignsForAutoGetPort() {
        return signsForAutoGetPort;
    }

    public void setSignsForAutoGetPort(List<String> signsForAutoGetPort) {
        this.signsForAutoGetPort = signsForAutoGetPort;
    }

    public PubDetail withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * 企业ID。
     * @return companyId
     */
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public PubDetail withPubRemark(String pubRemark) {
        this.pubRemark = pubRemark;
        return this;
    }

    /**
     * 服务号备注。
     * @return pubRemark
     */
    public String getPubRemark() {
        return pubRemark;
    }

    public void setPubRemark(String pubRemark) {
        this.pubRemark = pubRemark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PubDetail pubDetail = (PubDetail) o;
        return Objects.equals(this.pubId, pubDetail.pubId) && Objects.equals(this.operTime, pubDetail.operTime)
            && Objects.equals(this.state, pubDetail.state) && Objects.equals(this.onlineTime, pubDetail.onlineTime)
            && Objects.equals(this.companyName, pubDetail.companyName)
            && Objects.equals(this.pubName, pubDetail.pubName) && Objects.equals(this.logoImg, pubDetail.logoImg)
            && Objects.equals(this.logoUrl, pubDetail.logoUrl)
            && Objects.equals(this.authorizationFiles, pubDetail.authorizationFiles)
            && Objects.equals(this.autoGetPort, pubDetail.autoGetPort)
            && Objects.equals(this.industry, pubDetail.industry)
            && Objects.equals(this.pubAbstract, pubDetail.pubAbstract)
            && Objects.equals(this.signsForAutoGetPort, pubDetail.signsForAutoGetPort)
            && Objects.equals(this.companyId, pubDetail.companyId)
            && Objects.equals(this.pubRemark, pubDetail.pubRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubId,
            operTime,
            state,
            onlineTime,
            companyName,
            pubName,
            logoImg,
            logoUrl,
            authorizationFiles,
            autoGetPort,
            industry,
            pubAbstract,
            signsForAutoGetPort,
            companyId,
            pubRemark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PubDetail {\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    operTime: ").append(toIndentedString(operTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    logoImg: ").append(toIndentedString(logoImg)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    authorizationFiles: ").append(toIndentedString(authorizationFiles)).append("\n");
        sb.append("    autoGetPort: ").append(toIndentedString(autoGetPort)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    pubAbstract: ").append(toIndentedString(pubAbstract)).append("\n");
        sb.append("    signsForAutoGetPort: ").append(toIndentedString(signsForAutoGetPort)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    pubRemark: ").append(toIndentedString(pubRemark)).append("\n");
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
