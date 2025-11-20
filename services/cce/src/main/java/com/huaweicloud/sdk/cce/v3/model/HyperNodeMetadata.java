package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HyperNodeMetadata
 */
public class HyperNodeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownerReference")

    private HyperNodeMetadataOwnerReference ownerReference;

    public HyperNodeMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 超节点名称 > 命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围1-56位，且不能以中划线(-)结尾。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HyperNodeMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**： 超节点ID，资源唯一标识，创建成功后自动生成，填写无效
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public HyperNodeMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**： 创建时间，创建成功后自动生成，填写无效
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public HyperNodeMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * **参数解释**： 更新时间，创建成功后自动生成，填写无效
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public HyperNodeMetadata withOwnerReference(HyperNodeMetadataOwnerReference ownerReference) {
        this.ownerReference = ownerReference;
        return this;
    }

    public HyperNodeMetadata withOwnerReference(Consumer<HyperNodeMetadataOwnerReference> ownerReferenceSetter) {
        if (this.ownerReference == null) {
            this.ownerReference = new HyperNodeMetadataOwnerReference();
            ownerReferenceSetter.accept(this.ownerReference);
        }

        return this;
    }

    /**
     * Get ownerReference
     * @return ownerReference
     */
    public HyperNodeMetadataOwnerReference getOwnerReference() {
        return ownerReference;
    }

    public void setOwnerReference(HyperNodeMetadataOwnerReference ownerReference) {
        this.ownerReference = ownerReference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperNodeMetadata that = (HyperNodeMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp)
            && Objects.equals(this.ownerReference, that.ownerReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uid, creationTimestamp, updateTimestamp, ownerReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperNodeMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    ownerReference: ").append(toIndentedString(ownerReference)).append("\n");
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
