package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAccessPointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private String gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify")

    private String gmtModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessPoint")

    private String accessPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hidden_token")

    private String hiddenToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sw_business_id")

    private Integer swBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_download_url")

    private String agentDownloadUrl;

    public ShowAccessPointResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowAccessPointResponse withGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * 创建时间
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public ShowAccessPointResponse withGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    /**
     * 修改时间
     * @return gmtModify
     */
    public String getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
    }

    public ShowAccessPointResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 当前局点
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowAccessPointResponse withAccessPoint(String accessPoint) {
        this.accessPoint = accessPoint;
        return this;
    }

    /**
     * 接入点地址
     * @return accessPoint
     */
    public String getAccessPoint() {
        return accessPoint;
    }

    public void setAccessPoint(String accessPoint) {
        this.accessPoint = accessPoint;
    }

    public ShowAccessPointResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ShowAccessPointResponse withHiddenToken(String hiddenToken) {
        this.hiddenToken = hiddenToken;
        return this;
    }

    /**
     * token隐藏字符
     * @return hiddenToken
     */
    public String getHiddenToken() {
        return hiddenToken;
    }

    public void setHiddenToken(String hiddenToken) {
        this.hiddenToken = hiddenToken;
    }

    public ShowAccessPointResponse withSwBusinessId(Integer swBusinessId) {
        this.swBusinessId = swBusinessId;
        return this;
    }

    /**
     * 应用ID
     * @return swBusinessId
     */
    public Integer getSwBusinessId() {
        return swBusinessId;
    }

    public void setSwBusinessId(Integer swBusinessId) {
        this.swBusinessId = swBusinessId;
    }

    public ShowAccessPointResponse withAgentDownloadUrl(String agentDownloadUrl) {
        this.agentDownloadUrl = agentDownloadUrl;
        return this;
    }

    /**
     * agent下载地址
     * @return agentDownloadUrl
     */
    public String getAgentDownloadUrl() {
        return agentDownloadUrl;
    }

    public void setAgentDownloadUrl(String agentDownloadUrl) {
        this.agentDownloadUrl = agentDownloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAccessPointResponse that = (ShowAccessPointResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.gmtModify, that.gmtModify) && Objects.equals(this.region, that.region)
            && Objects.equals(this.accessPoint, that.accessPoint) && Objects.equals(this.token, that.token)
            && Objects.equals(this.hiddenToken, that.hiddenToken)
            && Objects.equals(this.swBusinessId, that.swBusinessId)
            && Objects.equals(this.agentDownloadUrl, that.agentDownloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, gmtCreate, gmtModify, region, accessPoint, token, hiddenToken, swBusinessId, agentDownloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessPointResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    accessPoint: ").append(toIndentedString(accessPoint)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    hiddenToken: ").append(toIndentedString(hiddenToken)).append("\n");
        sb.append("    swBusinessId: ").append(toIndentedString(swBusinessId)).append("\n");
        sb.append("    agentDownloadUrl: ").append(toIndentedString(agentDownloadUrl)).append("\n");
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
