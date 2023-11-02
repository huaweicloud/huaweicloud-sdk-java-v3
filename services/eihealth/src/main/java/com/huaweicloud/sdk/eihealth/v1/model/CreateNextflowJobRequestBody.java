package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNextflowJobRequestBody
 */
public class CreateNextflowJobRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonProperty(value = "params", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public CreateNextflowJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称，取值范围：[1,63]，允许大小写字母、数字、以及特殊字符中划线(-)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNextflowJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业的描述,取值范围：输入字符最大长度为255
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateNextflowJobRequestBody withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public CreateNextflowJobRequestBody addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateNextflowJobRequestBody withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 作业标签，取值范围[0,5]，单个标签最大长度32字符，支持中文、字母、数字、空格、下划线和中划线，且不能以空格开头或者结尾。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public CreateNextflowJobRequestBody withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 作业依赖的流程id
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public CreateNextflowJobRequestBody withParams(FormDataFilePart params) {
        this.params = params;
        return this;
    }

    /**
     * 流程参数列表文件，取值范围[0, 10M]
     * @return params
     */
    public FormDataFilePart getParams() {
        return params;
    }

    public void setParams(FormDataFilePart params) {
        this.params = params;
    }

    public CreateNextflowJobRequestBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业的优先级,取值范围[0,9]，0最低，默认数值0
     * minimum: 0
     * maximum: 9
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateNextflowJobRequestBody withParams(InputStream inputStream, String fileName, String contentType) {
        this.params = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateNextflowJobRequestBody withParams(InputStream inputStream, String fileName) {
        this.params = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateNextflowJobRequestBody withParams(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.params = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("name", new FormDataPart<>(name));
                if (description != null) {
                    put("description", new FormDataPart<>(description));
                }
                if (labels != null) {
                    put("labels", new FormDataPart<>(labels));
                }
                put("workflow_id", new FormDataPart<>(workflowId));
                if (params != null) {
                    put("params", params);
                }
                if (priority != null) {
                    put("priority", new FormDataPart<>(priority));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNextflowJobRequestBody that = (CreateNextflowJobRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.params, that.params) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, labels, workflowId, params, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNextflowJobRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    params: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
