package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCaseCcEmailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc_email_info")

    @JacksonXmlProperty(localName = "cc_email_info")

    private IncidentOrderCCEmailInfoV2 ccEmailInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mc_email_infos")

    @JacksonXmlProperty(localName = "mc_email_infos")

    private List<String> mcEmailInfos = null;

    public ListCaseCcEmailsResponse withCcEmailInfo(IncidentOrderCCEmailInfoV2 ccEmailInfo) {
        this.ccEmailInfo = ccEmailInfo;
        return this;
    }

    public ListCaseCcEmailsResponse withCcEmailInfo(Consumer<IncidentOrderCCEmailInfoV2> ccEmailInfoSetter) {
        if (this.ccEmailInfo == null) {
            this.ccEmailInfo = new IncidentOrderCCEmailInfoV2();
            ccEmailInfoSetter.accept(this.ccEmailInfo);
        }

        return this;
    }

    /**
     * Get ccEmailInfo
     * @return ccEmailInfo
     */
    public IncidentOrderCCEmailInfoV2 getCcEmailInfo() {
        return ccEmailInfo;
    }

    public void setCcEmailInfo(IncidentOrderCCEmailInfoV2 ccEmailInfo) {
        this.ccEmailInfo = ccEmailInfo;
    }

    public ListCaseCcEmailsResponse withMcEmailInfos(List<String> mcEmailInfos) {
        this.mcEmailInfos = mcEmailInfos;
        return this;
    }

    public ListCaseCcEmailsResponse addMcEmailInfosItem(String mcEmailInfosItem) {
        if (this.mcEmailInfos == null) {
            this.mcEmailInfos = new ArrayList<>();
        }
        this.mcEmailInfos.add(mcEmailInfosItem);
        return this;
    }

    public ListCaseCcEmailsResponse withMcEmailInfos(Consumer<List<String>> mcEmailInfosSetter) {
        if (this.mcEmailInfos == null) {
            this.mcEmailInfos = new ArrayList<>();
        }
        mcEmailInfosSetter.accept(this.mcEmailInfos);
        return this;
    }

    /**
     * 抄送邮箱信息
     * @return mcEmailInfos
     */
    public List<String> getMcEmailInfos() {
        return mcEmailInfos;
    }

    public void setMcEmailInfos(List<String> mcEmailInfos) {
        this.mcEmailInfos = mcEmailInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCaseCcEmailsResponse listCaseCcEmailsResponse = (ListCaseCcEmailsResponse) o;
        return Objects.equals(this.ccEmailInfo, listCaseCcEmailsResponse.ccEmailInfo)
            && Objects.equals(this.mcEmailInfos, listCaseCcEmailsResponse.mcEmailInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ccEmailInfo, mcEmailInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseCcEmailsResponse {\n");
        sb.append("    ccEmailInfo: ").append(toIndentedString(ccEmailInfo)).append("\n");
        sb.append("    mcEmailInfos: ").append(toIndentedString(mcEmailInfos)).append("\n");
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
