package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateVmsTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tplid")

    private String tplid;

    public CreateVmsTemplateResponse withTplid(String tplid) {
        this.tplid = tplid;
        return this;
    }

    /**
     * 智能信息基础版模板ID，用来唯一标识上传的模板。
     * @return tplid
     */
    public String getTplid() {
        return tplid;
    }

    public void setTplid(String tplid) {
        this.tplid = tplid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVmsTemplateResponse createVmsTemplateResponse = (CreateVmsTemplateResponse) o;
        return Objects.equals(this.tplid, createVmsTemplateResponse.tplid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVmsTemplateResponse {\n");
        sb.append("    tplid: ").append(toIndentedString(tplid)).append("\n");
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
