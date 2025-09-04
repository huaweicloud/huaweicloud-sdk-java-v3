package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置文件夹重定向。
 */
public class PoliciesFolderRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_redirection_status")

    private Integer folderRedirectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private FolderRedirectionOptions options;

    public PoliciesFolderRedirection withFolderRedirectionStatus(Integer folderRedirectionStatus) {
        this.folderRedirectionStatus = folderRedirectionStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 已禁用 1: 已启用 2: 未配置
     * @return folderRedirectionStatus
     */
    public Integer getFolderRedirectionStatus() {
        return folderRedirectionStatus;
    }

    public void setFolderRedirectionStatus(Integer folderRedirectionStatus) {
        this.folderRedirectionStatus = folderRedirectionStatus;
    }

    public PoliciesFolderRedirection withOptions(FolderRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesFolderRedirection withOptions(Consumer<FolderRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new FolderRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public FolderRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(FolderRedirectionOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesFolderRedirection that = (PoliciesFolderRedirection) obj;
        return Objects.equals(this.folderRedirectionStatus, that.folderRedirectionStatus)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderRedirectionStatus, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFolderRedirection {\n");
        sb.append("    folderRedirectionStatus: ").append(toIndentedString(folderRedirectionStatus)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
