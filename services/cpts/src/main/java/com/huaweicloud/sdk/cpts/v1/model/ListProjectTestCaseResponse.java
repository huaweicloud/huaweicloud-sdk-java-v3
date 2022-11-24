package com.huaweicloud.sdk.cpts.v1.model;

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
public class ListProjectTestCaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private List<ProjectDirectory> directory = null;

    public ListProjectTestCaseResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 状态码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListProjectTestCaseResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 描述
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListProjectTestCaseResponse withDirectory(List<ProjectDirectory> directory) {
        this.directory = directory;
        return this;
    }

    public ListProjectTestCaseResponse addDirectoryItem(ProjectDirectory directoryItem) {
        if (this.directory == null) {
            this.directory = new ArrayList<>();
        }
        this.directory.add(directoryItem);
        return this;
    }

    public ListProjectTestCaseResponse withDirectory(Consumer<List<ProjectDirectory>> directorySetter) {
        if (this.directory == null) {
            this.directory = new ArrayList<>();
        }
        directorySetter.accept(this.directory);
        return this;
    }

    /**
     * 用例集
     * @return directory
     */
    public List<ProjectDirectory> getDirectory() {
        return directory;
    }

    public void setDirectory(List<ProjectDirectory> directory) {
        this.directory = directory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectTestCaseResponse listProjectTestCaseResponse = (ListProjectTestCaseResponse) o;
        return Objects.equals(this.code, listProjectTestCaseResponse.code)
            && Objects.equals(this.message, listProjectTestCaseResponse.message)
            && Objects.equals(this.directory, listProjectTestCaseResponse.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, directory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectTestCaseResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
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
