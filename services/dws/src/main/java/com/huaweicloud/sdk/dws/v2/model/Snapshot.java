package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 快照对象。 **取值范围**： 不涉及。
 */
public class Snapshot {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public Snapshot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 快照名称。要求唯一性且必须以字母开头，不区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他的特殊字符，长度为4～64个字符。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Snapshot withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 指定创建快照的集群ID。 **取值范围**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Snapshot withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 快照描述，若不指定，描述为空。快照描述的字符长度不能超过256个字符，且不支持特殊字符!<>'=&\"。 **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Snapshot that = (Snapshot) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clusterId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Snapshot {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
