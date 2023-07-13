package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtensionQueryResult
 */
public class ExtensionQueryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensions")

    private List<ExtensionAllSnake> extensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_metadata")

    private List<ResultMetadataSnake> resultMetadata = null;

    public ExtensionQueryResult withExtensions(List<ExtensionAllSnake> extensions) {
        this.extensions = extensions;
        return this;
    }

    public ExtensionQueryResult addExtensionsItem(ExtensionAllSnake extensionsItem) {
        if (this.extensions == null) {
            this.extensions = new ArrayList<>();
        }
        this.extensions.add(extensionsItem);
        return this;
    }

    public ExtensionQueryResult withExtensions(Consumer<List<ExtensionAllSnake>> extensionsSetter) {
        if (this.extensions == null) {
            this.extensions = new ArrayList<>();
        }
        extensionsSetter.accept(this.extensions);
        return this;
    }

    /**
     * 插件列表集合
     * @return extensions
     */
    public List<ExtensionAllSnake> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<ExtensionAllSnake> extensions) {
        this.extensions = extensions;
    }

    public ExtensionQueryResult withResultMetadata(List<ResultMetadataSnake> resultMetadata) {
        this.resultMetadata = resultMetadata;
        return this;
    }

    public ExtensionQueryResult addResultMetadataItem(ResultMetadataSnake resultMetadataItem) {
        if (this.resultMetadata == null) {
            this.resultMetadata = new ArrayList<>();
        }
        this.resultMetadata.add(resultMetadataItem);
        return this;
    }

    public ExtensionQueryResult withResultMetadata(Consumer<List<ResultMetadataSnake>> resultMetadataSetter) {
        if (this.resultMetadata == null) {
            this.resultMetadata = new ArrayList<>();
        }
        resultMetadataSetter.accept(this.resultMetadata);
        return this;
    }

    /**
     * 结果元数据集合
     * @return resultMetadata
     */
    public List<ResultMetadataSnake> getResultMetadata() {
        return resultMetadata;
    }

    public void setResultMetadata(List<ResultMetadataSnake> resultMetadata) {
        this.resultMetadata = resultMetadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionQueryResult that = (ExtensionQueryResult) obj;
        return Objects.equals(this.extensions, that.extensions)
            && Objects.equals(this.resultMetadata, that.resultMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensions, resultMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionQueryResult {\n");
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
        sb.append("    resultMetadata: ").append(toIndentedString(resultMetadata)).append("\n");
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
