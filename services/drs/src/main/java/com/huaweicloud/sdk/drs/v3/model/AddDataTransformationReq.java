package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据加工规则
 */
public class AddDataTransformationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_info")

    private List<CreateDataCompareDatabaseObject> objectInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transformation_info")

    private CreateDataCompareTransformationInfo transformationInfo;

    public AddDataTransformationReq withObjectInfo(List<CreateDataCompareDatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
        return this;
    }

    public AddDataTransformationReq addObjectInfoItem(CreateDataCompareDatabaseObject objectInfoItem) {
        if (this.objectInfo == null) {
            this.objectInfo = new ArrayList<>();
        }
        this.objectInfo.add(objectInfoItem);
        return this;
    }

    public AddDataTransformationReq withObjectInfo(Consumer<List<CreateDataCompareDatabaseObject>> objectInfoSetter) {
        if (this.objectInfo == null) {
            this.objectInfo = new ArrayList<>();
        }
        objectInfoSetter.accept(this.objectInfo);
        return this;
    }

    /**
     * 对象信息。
     * @return objectInfo
     */
    public List<CreateDataCompareDatabaseObject> getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(List<CreateDataCompareDatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
    }

    public AddDataTransformationReq withTransformationInfo(CreateDataCompareTransformationInfo transformationInfo) {
        this.transformationInfo = transformationInfo;
        return this;
    }

    public AddDataTransformationReq withTransformationInfo(
        Consumer<CreateDataCompareTransformationInfo> transformationInfoSetter) {
        if (this.transformationInfo == null) {
            this.transformationInfo = new CreateDataCompareTransformationInfo();
            transformationInfoSetter.accept(this.transformationInfo);
        }

        return this;
    }

    /**
     * Get transformationInfo
     * @return transformationInfo
     */
    public CreateDataCompareTransformationInfo getTransformationInfo() {
        return transformationInfo;
    }

    public void setTransformationInfo(CreateDataCompareTransformationInfo transformationInfo) {
        this.transformationInfo = transformationInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDataTransformationReq that = (AddDataTransformationReq) obj;
        return Objects.equals(this.objectInfo, that.objectInfo)
            && Objects.equals(this.transformationInfo, that.transformationInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectInfo, transformationInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataTransformationReq {\n");
        sb.append("    objectInfo: ").append(toIndentedString(objectInfo)).append("\n");
        sb.append("    transformationInfo: ").append(toIndentedString(transformationInfo)).append("\n");
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
