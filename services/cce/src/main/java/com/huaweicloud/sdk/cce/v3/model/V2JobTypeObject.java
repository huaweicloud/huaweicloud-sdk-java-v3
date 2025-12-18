package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * V2JobTypeObject
 */
public class V2JobTypeObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    public V2JobTypeObject withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**： Job UUID **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public V2JobTypeObject withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**： Job 创建时间 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public V2JobTypeObject withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * **参数解释**： Job 最后更新时间 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2JobTypeObject that = (V2JobTypeObject) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, creationTimestamp, updateTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2JobTypeObject {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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
