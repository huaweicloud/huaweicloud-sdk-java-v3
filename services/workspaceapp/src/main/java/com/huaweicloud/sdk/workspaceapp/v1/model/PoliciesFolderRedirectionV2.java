package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置文件夹重定向(v2)。
 */
public class PoliciesFolderRedirectionV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_redirection_v2_status")

    private Integer folderRedirectionV2Status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private FolderRedirectionV2Options options;

    public PoliciesFolderRedirectionV2 withFolderRedirectionV2Status(Integer folderRedirectionV2Status) {
        this.folderRedirectionV2Status = folderRedirectionV2Status;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 关闭 1: 已启用
     * @return folderRedirectionV2Status
     */
    public Integer getFolderRedirectionV2Status() {
        return folderRedirectionV2Status;
    }

    public void setFolderRedirectionV2Status(Integer folderRedirectionV2Status) {
        this.folderRedirectionV2Status = folderRedirectionV2Status;
    }

    public PoliciesFolderRedirectionV2 withOptions(FolderRedirectionV2Options options) {
        this.options = options;
        return this;
    }

    public PoliciesFolderRedirectionV2 withOptions(Consumer<FolderRedirectionV2Options> optionsSetter) {
        if (this.options == null) {
            this.options = new FolderRedirectionV2Options();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public FolderRedirectionV2Options getOptions() {
        return options;
    }

    public void setOptions(FolderRedirectionV2Options options) {
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
        PoliciesFolderRedirectionV2 that = (PoliciesFolderRedirectionV2) obj;
        return Objects.equals(this.folderRedirectionV2Status, that.folderRedirectionV2Status)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderRedirectionV2Status, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFolderRedirectionV2 {\n");
        sb.append("    folderRedirectionV2Status: ").append(toIndentedString(folderRedirectionV2Status)).append("\n");
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
