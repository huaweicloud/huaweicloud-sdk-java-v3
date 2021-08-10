package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** CreateFaceSetReq */
public class CreateFaceSetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    private Map<String, TypeInfo> externalFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_capacity")

    private Integer faceSetCapacity;

    public CreateFaceSetReq withExternalFields(Map<String, TypeInfo> externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    public CreateFaceSetReq putExternalFieldsItem(String key, TypeInfo externalFieldsItem) {
        if (this.externalFields == null) {
            this.externalFields = new HashMap<>();
        }
        this.externalFields.put(key, externalFieldsItem);
        return this;
    }

    public CreateFaceSetReq withExternalFields(Consumer<Map<String, TypeInfo>> externalFieldsSetter) {
        if (this.externalFields == null) {
            this.externalFields = new HashMap<>();
        }
        externalFieldsSetter.accept(this.externalFields);
        return this;
    }

    /** 用户自定义数据，自定义字段不能以系统保留字段vector、bounding_box、external_image_id、face_id、create_time、_id、_all、_source等字段命名。
     * Json字符串不校验重复性，自定义字段的key值长度范围为[1,36]，string类型的value长度范围为[1,256]，具体参见[自定义字段](zh-cn_topic_0130807044.xml)。
     * 
     * @return externalFields */
    public Map<String, TypeInfo> getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(Map<String, TypeInfo> externalFields) {
        this.externalFields = externalFields;
    }

    public CreateFaceSetReq withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /** 人脸库名称。 建议人脸库的名称不要以下划线（_）开头，否则云监控服务会无法采集人脸数量。
     * 
     * @return faceSetName */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public CreateFaceSetReq withFaceSetCapacity(Integer faceSetCapacity) {
        this.faceSetCapacity = faceSetCapacity;
        return this;
    }

    /** 人脸库最大的容量，填写1万整数倍的数字，例如：30000。
     * 默认为100000，最大值为100000，可通过创建新的人脸库进行扩容，每个用户可免费默认使用10个人脸库，每个人脸库容量为10万个人脸特征。如需扩容单个人脸库规模，请联系华为云客服确认扩容规模与价格。
     * 
     * @return faceSetCapacity */
    public Integer getFaceSetCapacity() {
        return faceSetCapacity;
    }

    public void setFaceSetCapacity(Integer faceSetCapacity) {
        this.faceSetCapacity = faceSetCapacity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFaceSetReq createFaceSetReq = (CreateFaceSetReq) o;
        return Objects.equals(this.externalFields, createFaceSetReq.externalFields)
            && Objects.equals(this.faceSetName, createFaceSetReq.faceSetName)
            && Objects.equals(this.faceSetCapacity, createFaceSetReq.faceSetCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalFields, faceSetName, faceSetCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFaceSetReq {\n");
        sb.append("    externalFields: ").append(toIndentedString(externalFields)).append("\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    faceSetCapacity: ").append(toIndentedString(faceSetCapacity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
