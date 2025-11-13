package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowLivePlatformAccessTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_types")

    private List<AccessTypeEnum> accessTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowLivePlatformAccessTypeResponse withAccessTypes(List<AccessTypeEnum> accessTypes) {
        this.accessTypes = accessTypes;
        return this;
    }

    public ShowLivePlatformAccessTypeResponse addAccessTypesItem(AccessTypeEnum accessTypesItem) {
        if (this.accessTypes == null) {
            this.accessTypes = new ArrayList<>();
        }
        this.accessTypes.add(accessTypesItem);
        return this;
    }

    public ShowLivePlatformAccessTypeResponse withAccessTypes(Consumer<List<AccessTypeEnum>> accessTypesSetter) {
        if (this.accessTypes == null) {
            this.accessTypes = new ArrayList<>();
        }
        accessTypesSetter.accept(this.accessTypes);
        return this;
    }

    /**
     * 平台对接类型列表
     * @return accessTypes
     */
    public List<AccessTypeEnum> getAccessTypes() {
        return accessTypes;
    }

    public void setAccessTypes(List<AccessTypeEnum> accessTypes) {
        this.accessTypes = accessTypes;
    }

    public ShowLivePlatformAccessTypeResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLivePlatformAccessTypeResponse that = (ShowLivePlatformAccessTypeResponse) obj;
        return Objects.equals(this.accessTypes, that.accessTypes) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessTypes, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLivePlatformAccessTypeResponse {\n");
        sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
