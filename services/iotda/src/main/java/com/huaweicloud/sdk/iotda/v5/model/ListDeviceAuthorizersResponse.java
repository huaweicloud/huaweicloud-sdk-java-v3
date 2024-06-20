package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListDeviceAuthorizersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizers")

    private List<DeviceAuthorizerSimple> authorizers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDeviceAuthorizersResponse withAuthorizers(List<DeviceAuthorizerSimple> authorizers) {
        this.authorizers = authorizers;
        return this;
    }

    public ListDeviceAuthorizersResponse addAuthorizersItem(DeviceAuthorizerSimple authorizersItem) {
        if (this.authorizers == null) {
            this.authorizers = new ArrayList<>();
        }
        this.authorizers.add(authorizersItem);
        return this;
    }

    public ListDeviceAuthorizersResponse withAuthorizers(Consumer<List<DeviceAuthorizerSimple>> authorizersSetter) {
        if (this.authorizers == null) {
            this.authorizers = new ArrayList<>();
        }
        authorizersSetter.accept(this.authorizers);
        return this;
    }

    /**
     * **参数说明**：自定义鉴权列表。
     * @return authorizers
     */
    public List<DeviceAuthorizerSimple> getAuthorizers() {
        return authorizers;
    }

    public void setAuthorizers(List<DeviceAuthorizerSimple> authorizers) {
        this.authorizers = authorizers;
    }

    public ListDeviceAuthorizersResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceAuthorizersResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeviceAuthorizersResponse that = (ListDeviceAuthorizersResponse) obj;
        return Objects.equals(this.authorizers, that.authorizers) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizers, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceAuthorizersResponse {\n");
        sb.append("    authorizers: ").append(toIndentedString(authorizers)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
