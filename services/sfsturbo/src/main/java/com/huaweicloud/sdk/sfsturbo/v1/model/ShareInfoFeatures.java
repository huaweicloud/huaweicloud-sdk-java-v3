package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件系统的特性支持情况。
 */
public class ShareInfoFeatures {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup")

    private ShareInfoFeature backup;

    public ShareInfoFeatures withBackup(ShareInfoFeature backup) {
        this.backup = backup;
        return this;
    }

    public ShareInfoFeatures withBackup(Consumer<ShareInfoFeature> backupSetter) {
        if (this.backup == null) {
            this.backup = new ShareInfoFeature();
            backupSetter.accept(this.backup);
        }

        return this;
    }

    /**
     * Get backup
     * @return backup
     */
    public ShareInfoFeature getBackup() {
        return backup;
    }

    public void setBackup(ShareInfoFeature backup) {
        this.backup = backup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareInfoFeatures that = (ShareInfoFeatures) obj;
        return Objects.equals(this.backup, that.backup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareInfoFeatures {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
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
