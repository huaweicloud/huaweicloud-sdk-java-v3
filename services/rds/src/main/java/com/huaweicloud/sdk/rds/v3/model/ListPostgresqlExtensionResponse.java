package com.huaweicloud.sdk.rds.v3.model;

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
public class ListPostgresqlExtensionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensions")

    private List<ExtensionsResponse> extensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListPostgresqlExtensionResponse withExtensions(List<ExtensionsResponse> extensions) {
        this.extensions = extensions;
        return this;
    }

    public ListPostgresqlExtensionResponse addExtensionsItem(ExtensionsResponse extensionsItem) {
        if (this.extensions == null) {
            this.extensions = new ArrayList<>();
        }
        this.extensions.add(extensionsItem);
        return this;
    }

    public ListPostgresqlExtensionResponse withExtensions(Consumer<List<ExtensionsResponse>> extensionsSetter) {
        if (this.extensions == null) {
            this.extensions = new ArrayList<>();
        }
        extensionsSetter.accept(this.extensions);
        return this;
    }

    /**
     * Get extensions
     * @return extensions
     */
    public List<ExtensionsResponse> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<ExtensionsResponse> extensions) {
        this.extensions = extensions;
    }

    public ListPostgresqlExtensionResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总插件数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPostgresqlExtensionResponse that = (ListPostgresqlExtensionResponse) obj;
        return Objects.equals(this.extensions, that.extensions) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensions, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostgresqlExtensionResponse {\n");
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
