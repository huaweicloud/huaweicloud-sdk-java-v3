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
 * UpdateNextflowWorkflowRequestBody
 */
public class UpdateNextflowWorkflowRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "workflow_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart workflowFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_file")

    private String mainFile;

    @JsonProperty(value = "params", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart params;

    public UpdateNextflowWorkflowRequestBody withWorkflowFile(FormDataFilePart workflowFile) {
        this.workflowFile = workflowFile;
        return this;
    }

    /**
     * 流程文件，文件大小[0,10M]
     * @return workflowFile
     */
    public FormDataFilePart getWorkflowFile() {
        return workflowFile;
    }

    public void setWorkflowFile(FormDataFilePart workflowFile) {
        this.workflowFile = workflowFile;
    }

    public UpdateNextflowWorkflowRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流程描述 取值范围[0,65535]
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateNextflowWorkflowRequestBody withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public UpdateNextflowWorkflowRequestBody addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public UpdateNextflowWorkflowRequestBody withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 流程标签，取值范围[0,5]，单个标签最大长度32字符，支持中文、字母、数字、空格、下划线和中划线，且不能以空格开头或者结尾。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public UpdateNextflowWorkflowRequestBody withMainFile(String mainFile) {
        this.mainFile = mainFile;
        return this;
    }

    /**
     * 主文件名
     * @return mainFile
     */
    public String getMainFile() {
        return mainFile;
    }

    public void setMainFile(String mainFile) {
        this.mainFile = mainFile;
    }

    public UpdateNextflowWorkflowRequestBody withParams(FormDataFilePart params) {
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

    public UpdateNextflowWorkflowRequestBody withWorkflowFile(InputStream inputStream, String fileName,
        String contentType) {
        this.workflowFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UpdateNextflowWorkflowRequestBody withWorkflowFile(InputStream inputStream, String fileName) {
        this.workflowFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UpdateNextflowWorkflowRequestBody withWorkflowFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.workflowFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    public UpdateNextflowWorkflowRequestBody withParams(InputStream inputStream, String fileName, String contentType) {
        this.params = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UpdateNextflowWorkflowRequestBody withParams(InputStream inputStream, String fileName) {
        this.params = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UpdateNextflowWorkflowRequestBody withParams(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.params = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (workflowFile != null) {
                    put("workflow_file", workflowFile);
                }
                if (description != null) {
                    put("description", new FormDataPart<>(description));
                }
                if (labels != null) {
                    put("labels", new FormDataPart<>(labels));
                }
                if (mainFile != null) {
                    put("main_file", new FormDataPart<>(mainFile));
                }
                if (params != null) {
                    put("params", params);
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNextflowWorkflowRequestBody updateNextflowWorkflowRequestBody = (UpdateNextflowWorkflowRequestBody) o;
        return Objects.equals(this.workflowFile, updateNextflowWorkflowRequestBody.workflowFile)
            && Objects.equals(this.description, updateNextflowWorkflowRequestBody.description)
            && Objects.equals(this.labels, updateNextflowWorkflowRequestBody.labels)
            && Objects.equals(this.mainFile, updateNextflowWorkflowRequestBody.mainFile)
            && Objects.equals(this.params, updateNextflowWorkflowRequestBody.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowFile, description, labels, mainFile, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNextflowWorkflowRequestBody {\n");
        sb.append("    workflowFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    mainFile: ").append(toIndentedString(mainFile)).append("\n");
        sb.append("    params: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
