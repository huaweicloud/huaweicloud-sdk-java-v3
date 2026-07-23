package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时存储配置，支持挂载SFS Turbo存储类型。
 */
public class CoreRunStorageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfs_turbo")

    private List<CoreRunSfsTurboStorageConfig> sfsTurbo = null;

    public CoreRunStorageConfig withSfsTurbo(List<CoreRunSfsTurboStorageConfig> sfsTurbo) {
        this.sfsTurbo = sfsTurbo;
        return this;
    }

    public CoreRunStorageConfig addSfsTurboItem(CoreRunSfsTurboStorageConfig sfsTurboItem) {
        if (this.sfsTurbo == null) {
            this.sfsTurbo = new ArrayList<>();
        }
        this.sfsTurbo.add(sfsTurboItem);
        return this;
    }

    public CoreRunStorageConfig withSfsTurbo(Consumer<List<CoreRunSfsTurboStorageConfig>> sfsTurboSetter) {
        if (this.sfsTurbo == null) {
            this.sfsTurbo = new ArrayList<>();
        }
        sfsTurboSetter.accept(this.sfsTurbo);
        return this;
    }

    /**
     * **参数解释**: SFS Turbo存储挂载配置列表。
     * @return sfsTurbo
     */
    public List<CoreRunSfsTurboStorageConfig> getSfsTurbo() {
        return sfsTurbo;
    }

    public void setSfsTurbo(List<CoreRunSfsTurboStorageConfig> sfsTurbo) {
        this.sfsTurbo = sfsTurbo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunStorageConfig that = (CoreRunStorageConfig) obj;
        return Objects.equals(this.sfsTurbo, that.sfsTurbo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfsTurbo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunStorageConfig {\n");
        sb.append("    sfsTurbo: ").append(toIndentedString(sfsTurbo)).append("\n");
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
