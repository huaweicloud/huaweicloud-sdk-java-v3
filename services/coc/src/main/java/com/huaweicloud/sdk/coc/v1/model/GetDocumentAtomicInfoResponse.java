package com.huaweicloud.sdk.coc.v1.model;

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
public class GetDocumentAtomicInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_unique_key")

    private String atomicUniqueKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_name_zh")

    private String atomicNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_name_en")

    private String atomicNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<AtomicInputModel> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private AtomicOutputModel outputs;

    public GetDocumentAtomicInfoResponse withAtomicUniqueKey(String atomicUniqueKey) {
        this.atomicUniqueKey = atomicUniqueKey;
        return this;
    }

    /**
     * 原子能力唯一标识：只允许字母+下划线，字母开头
     * @return atomicUniqueKey
     */
    public String getAtomicUniqueKey() {
        return atomicUniqueKey;
    }

    public void setAtomicUniqueKey(String atomicUniqueKey) {
        this.atomicUniqueKey = atomicUniqueKey;
    }

    public GetDocumentAtomicInfoResponse withAtomicNameZh(String atomicNameZh) {
        this.atomicNameZh = atomicNameZh;
        return this;
    }

    /**
     * 中文名
     * @return atomicNameZh
     */
    public String getAtomicNameZh() {
        return atomicNameZh;
    }

    public void setAtomicNameZh(String atomicNameZh) {
        this.atomicNameZh = atomicNameZh;
    }

    public GetDocumentAtomicInfoResponse withAtomicNameEn(String atomicNameEn) {
        this.atomicNameEn = atomicNameEn;
        return this;
    }

    /**
     * 英文名
     * @return atomicNameEn
     */
    public String getAtomicNameEn() {
        return atomicNameEn;
    }

    public void setAtomicNameEn(String atomicNameEn) {
        this.atomicNameEn = atomicNameEn;
    }

    public GetDocumentAtomicInfoResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public GetDocumentAtomicInfoResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GetDocumentAtomicInfoResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public GetDocumentAtomicInfoResponse withInputs(List<AtomicInputModel> inputs) {
        this.inputs = inputs;
        return this;
    }

    public GetDocumentAtomicInfoResponse addInputsItem(AtomicInputModel inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public GetDocumentAtomicInfoResponse withInputs(Consumer<List<AtomicInputModel>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 原子能力入参
     * @return inputs
     */
    public List<AtomicInputModel> getInputs() {
        return inputs;
    }

    public void setInputs(List<AtomicInputModel> inputs) {
        this.inputs = inputs;
    }

    public GetDocumentAtomicInfoResponse withOutputs(AtomicOutputModel outputs) {
        this.outputs = outputs;
        return this;
    }

    public GetDocumentAtomicInfoResponse withOutputs(Consumer<AtomicOutputModel> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new AtomicOutputModel();
            outputsSetter.accept(this.outputs);
        }

        return this;
    }

    /**
     * Get outputs
     * @return outputs
     */
    public AtomicOutputModel getOutputs() {
        return outputs;
    }

    public void setOutputs(AtomicOutputModel outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDocumentAtomicInfoResponse that = (GetDocumentAtomicInfoResponse) obj;
        return Objects.equals(this.atomicUniqueKey, that.atomicUniqueKey)
            && Objects.equals(this.atomicNameZh, that.atomicNameZh)
            && Objects.equals(this.atomicNameEn, that.atomicNameEn) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atomicUniqueKey, atomicNameZh, atomicNameEn, tags, inputs, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDocumentAtomicInfoResponse {\n");
        sb.append("    atomicUniqueKey: ").append(toIndentedString(atomicUniqueKey)).append("\n");
        sb.append("    atomicNameZh: ").append(toIndentedString(atomicNameZh)).append("\n");
        sb.append("    atomicNameEn: ").append(toIndentedString(atomicNameEn)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
