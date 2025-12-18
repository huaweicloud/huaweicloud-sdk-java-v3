package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * V2JobSpec
 */
public class V2JobSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusteruid")

    private String clusteruid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceid")

    private String resourceid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourcename")

    private String resourcename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private Map<String, String> extendparam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subjobs")

    private List<V2Job> subjobs = null;

    public V2JobSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： Job 类型 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public V2JobSpec withClusteruid(String clusteruid) {
        this.clusteruid = clusteruid;
        return this;
    }

    /**
     * **参数解释**： 集群ID **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return clusteruid
     */
    public String getClusteruid() {
        return clusteruid;
    }

    public void setClusteruid(String clusteruid) {
        this.clusteruid = clusteruid;
    }

    public V2JobSpec withResourceid(String resourceid) {
        this.resourceid = resourceid;
        return this;
    }

    /**
     * **参数解释**： 资源ID **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return resourceid
     */
    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid;
    }

    public V2JobSpec withResourcename(String resourcename) {
        this.resourcename = resourcename;
        return this;
    }

    /**
     * **参数解释**： 资源名称 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return resourcename
     */
    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public V2JobSpec withExtendparam(Map<String, String> extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public V2JobSpec putExtendparamItem(String key, String extendparamItem) {
        if (this.extendparam == null) {
            this.extendparam = new HashMap<>();
        }
        this.extendparam.put(key, extendparamItem);
        return this;
    }

    public V2JobSpec withExtendparam(Consumer<Map<String, String>> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new HashMap<>();
        }
        extendparamSetter.accept(this.extendparam);
        return this;
    }

    /**
     * **参数解释**： Job的扩容参数 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return extendparam
     */
    public Map<String, String> getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(Map<String, String> extendparam) {
        this.extendparam = extendparam;
    }

    public V2JobSpec withSubjobs(List<V2Job> subjobs) {
        this.subjobs = subjobs;
        return this;
    }

    public V2JobSpec addSubjobsItem(V2Job subjobsItem) {
        if (this.subjobs == null) {
            this.subjobs = new ArrayList<>();
        }
        this.subjobs.add(subjobsItem);
        return this;
    }

    public V2JobSpec withSubjobs(Consumer<List<V2Job>> subjobsSetter) {
        if (this.subjobs == null) {
            this.subjobs = new ArrayList<>();
        }
        subjobsSetter.accept(this.subjobs);
        return this;
    }

    /**
     * **参数解释**： 子Job详情列表 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return subjobs
     */
    public List<V2Job> getSubjobs() {
        return subjobs;
    }

    public void setSubjobs(List<V2Job> subjobs) {
        this.subjobs = subjobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2JobSpec that = (V2JobSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.clusteruid, that.clusteruid)
            && Objects.equals(this.resourceid, that.resourceid) && Objects.equals(this.resourcename, that.resourcename)
            && Objects.equals(this.extendparam, that.extendparam) && Objects.equals(this.subjobs, that.subjobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, clusteruid, resourceid, resourcename, extendparam, subjobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2JobSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusteruid: ").append(toIndentedString(clusteruid)).append("\n");
        sb.append("    resourceid: ").append(toIndentedString(resourceid)).append("\n");
        sb.append("    resourcename: ").append(toIndentedString(resourcename)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    subjobs: ").append(toIndentedString(subjobs)).append("\n");
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
