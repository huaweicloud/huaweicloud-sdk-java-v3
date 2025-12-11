package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowFilePathWhiteDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_path")

    private List<String> defaultPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customized_path")

    private List<String> customizedPath = null;

    public ShowFilePathWhiteDetailResponse withDefaultPath(List<String> defaultPath) {
        this.defaultPath = defaultPath;
        return this;
    }

    public ShowFilePathWhiteDetailResponse addDefaultPathItem(String defaultPathItem) {
        if (this.defaultPath == null) {
            this.defaultPath = new ArrayList<>();
        }
        this.defaultPath.add(defaultPathItem);
        return this;
    }

    public ShowFilePathWhiteDetailResponse withDefaultPath(Consumer<List<String>> defaultPathSetter) {
        if (this.defaultPath == null) {
            this.defaultPath = new ArrayList<>();
        }
        defaultPathSetter.accept(this.defaultPath);
        return this;
    }

    /**
     * **参数解释**: 默认路径，不可编辑 **取值范围**: 最小值0，最大值20000 
     * @return defaultPath
     */
    public List<String> getDefaultPath() {
        return defaultPath;
    }

    public void setDefaultPath(List<String> defaultPath) {
        this.defaultPath = defaultPath;
    }

    public ShowFilePathWhiteDetailResponse withCustomizedPath(List<String> customizedPath) {
        this.customizedPath = customizedPath;
        return this;
    }

    public ShowFilePathWhiteDetailResponse addCustomizedPathItem(String customizedPathItem) {
        if (this.customizedPath == null) {
            this.customizedPath = new ArrayList<>();
        }
        this.customizedPath.add(customizedPathItem);
        return this;
    }

    public ShowFilePathWhiteDetailResponse withCustomizedPath(Consumer<List<String>> customizedPathSetter) {
        if (this.customizedPath == null) {
            this.customizedPath = new ArrayList<>();
        }
        customizedPathSetter.accept(this.customizedPath);
        return this;
    }

    /**
     * **参数解释**: 自定义路径，选填，可编辑 **取值范围**: 最小值0，最大值20000 
     * @return customizedPath
     */
    public List<String> getCustomizedPath() {
        return customizedPath;
    }

    public void setCustomizedPath(List<String> customizedPath) {
        this.customizedPath = customizedPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFilePathWhiteDetailResponse that = (ShowFilePathWhiteDetailResponse) obj;
        return Objects.equals(this.defaultPath, that.defaultPath)
            && Objects.equals(this.customizedPath, that.customizedPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultPath, customizedPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFilePathWhiteDetailResponse {\n");
        sb.append("    defaultPath: ").append(toIndentedString(defaultPath)).append("\n");
        sb.append("    customizedPath: ").append(toIndentedString(customizedPath)).append("\n");
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
