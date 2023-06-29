package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ImportMicroserviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_group_id")

    private String apiGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<MicroserviceImportApiResp> apis = null;

    public ImportMicroserviceResponse withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /**
     * vpc通道编号
     * @return vpcChannelId
     */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    public ImportMicroserviceResponse withApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * api分组编号
     * @return apiGroupId
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    public ImportMicroserviceResponse withApis(List<MicroserviceImportApiResp> apis) {
        this.apis = apis;
        return this;
    }

    public ImportMicroserviceResponse addApisItem(MicroserviceImportApiResp apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ImportMicroserviceResponse withApis(Consumer<List<MicroserviceImportApiResp>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 导入的api列表
     * @return apis
     */
    public List<MicroserviceImportApiResp> getApis() {
        return apis;
    }

    public void setApis(List<MicroserviceImportApiResp> apis) {
        this.apis = apis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportMicroserviceResponse that = (ImportMicroserviceResponse) obj;
        return Objects.equals(this.vpcChannelId, that.vpcChannelId) && Objects.equals(this.apiGroupId, that.apiGroupId)
            && Objects.equals(this.apis, that.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcChannelId, apiGroupId, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportMicroserviceResponse {\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    apiGroupId: ").append(toIndentedString(apiGroupId)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
