package com.huaweicloud.sdk.waf.v1.model;

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
public class CreateCloudWafPostPaidResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceResponse> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isNewUser")

    private Boolean isNewUser;

    public CreateCloudWafPostPaidResourceResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 云模式版本   - -2：已冻结   - -1：未订购   - 2：标准版   - 3：专业版   - 4：铂金版   - 7: 入门版   - 22：按需版本
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CreateCloudWafPostPaidResourceResponse withResources(List<ResourceResponse> resources) {
        this.resources = resources;
        return this;
    }

    public CreateCloudWafPostPaidResourceResponse addResourcesItem(ResourceResponse resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CreateCloudWafPostPaidResourceResponse withResources(Consumer<List<ResourceResponse>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<ResourceResponse> getResources() {
        return resources;
    }

    public void setResources(List<ResourceResponse> resources) {
        this.resources = resources;
    }

    public CreateCloudWafPostPaidResourceResponse withIsNewUser(Boolean isNewUser) {
        this.isNewUser = isNewUser;
        return this;
    }

    /**
     * 是否为新用户
     * @return isNewUser
     */
    public Boolean getIsNewUser() {
        return isNewUser;
    }

    public void setIsNewUser(Boolean isNewUser) {
        this.isNewUser = isNewUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudWafPostPaidResourceResponse that = (CreateCloudWafPostPaidResourceResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.isNewUser, that.isNewUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, resources, isNewUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudWafPostPaidResourceResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    isNewUser: ").append(toIndentedString(isNewUser)).append("\n");
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
