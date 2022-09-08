package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EngineGroupsInfo
 */
public class EngineGroupsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportAzs")

    private List<SupportAzsInfo> supportAzs = null;

    public EngineGroupsInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 引擎id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EngineGroupsInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 引擎名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EngineGroupsInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 引擎版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public EngineGroupsInfo withSupportAzs(List<SupportAzsInfo> supportAzs) {
        this.supportAzs = supportAzs;
        return this;
    }

    public EngineGroupsInfo addSupportAzsItem(SupportAzsInfo supportAzsItem) {
        if (this.supportAzs == null) {
            this.supportAzs = new ArrayList<>();
        }
        this.supportAzs.add(supportAzsItem);
        return this;
    }

    public EngineGroupsInfo withSupportAzs(Consumer<List<SupportAzsInfo>> supportAzsSetter) {
        if (this.supportAzs == null) {
            this.supportAzs = new ArrayList<>();
        }
        supportAzsSetter.accept(this.supportAzs);
        return this;
    }

    /**
     * 可用区列表。
     * @return supportAzs
     */
    public List<SupportAzsInfo> getSupportAzs() {
        return supportAzs;
    }

    public void setSupportAzs(List<SupportAzsInfo> supportAzs) {
        this.supportAzs = supportAzs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngineGroupsInfo engineGroupsInfo = (EngineGroupsInfo) o;
        return Objects.equals(this.id, engineGroupsInfo.id) && Objects.equals(this.name, engineGroupsInfo.name)
            && Objects.equals(this.version, engineGroupsInfo.version)
            && Objects.equals(this.supportAzs, engineGroupsInfo.supportAzs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, version, supportAzs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineGroupsInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    supportAzs: ").append(toIndentedString(supportAzs)).append("\n");
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
