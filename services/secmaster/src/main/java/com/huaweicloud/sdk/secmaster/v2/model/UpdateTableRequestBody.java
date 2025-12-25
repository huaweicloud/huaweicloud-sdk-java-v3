package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTableRequestBody
 */
public class UpdateTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias_en")

    private String tableAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias_fr")

    private String tableAliasFr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_fr")

    private String descriptionFr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_en")

    private String directoryEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_fr")

    private String directoryFr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_setting")

    private IsapTableStorageSettingDto storageSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_setting")

    private IsapTableDisplaySettingDto displaySetting;

    public UpdateTableRequestBody withTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
        return this;
    }

    /**
     * 表别名
     * @return tableAlias
     */
    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public UpdateTableRequestBody withTableAliasEn(String tableAliasEn) {
        this.tableAliasEn = tableAliasEn;
        return this;
    }

    /**
     * 表别名
     * @return tableAliasEn
     */
    public String getTableAliasEn() {
        return tableAliasEn;
    }

    public void setTableAliasEn(String tableAliasEn) {
        this.tableAliasEn = tableAliasEn;
    }

    public UpdateTableRequestBody withTableAliasFr(String tableAliasFr) {
        this.tableAliasFr = tableAliasFr;
        return this;
    }

    /**
     * 表别名
     * @return tableAliasFr
     */
    public String getTableAliasFr() {
        return tableAliasFr;
    }

    public void setTableAliasFr(String tableAliasFr) {
        this.tableAliasFr = tableAliasFr;
    }

    public UpdateTableRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 表相关描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTableRequestBody withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * 表相关描述
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public UpdateTableRequestBody withDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
        return this;
    }

    /**
     * 表相关描述
     * @return descriptionFr
     */
    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public UpdateTableRequestBody withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public UpdateTableRequestBody withDirectoryEn(String directoryEn) {
        this.directoryEn = directoryEn;
        return this;
    }

    /**
     * 目录分组
     * @return directoryEn
     */
    public String getDirectoryEn() {
        return directoryEn;
    }

    public void setDirectoryEn(String directoryEn) {
        this.directoryEn = directoryEn;
    }

    public UpdateTableRequestBody withDirectoryFr(String directoryFr) {
        this.directoryFr = directoryFr;
        return this;
    }

    /**
     * 目录分组
     * @return directoryFr
     */
    public String getDirectoryFr() {
        return directoryFr;
    }

    public void setDirectoryFr(String directoryFr) {
        this.directoryFr = directoryFr;
    }

    public UpdateTableRequestBody withStorageSetting(IsapTableStorageSettingDto storageSetting) {
        this.storageSetting = storageSetting;
        return this;
    }

    public UpdateTableRequestBody withStorageSetting(Consumer<IsapTableStorageSettingDto> storageSettingSetter) {
        if (this.storageSetting == null) {
            this.storageSetting = new IsapTableStorageSettingDto();
            storageSettingSetter.accept(this.storageSetting);
        }

        return this;
    }

    /**
     * Get storageSetting
     * @return storageSetting
     */
    public IsapTableStorageSettingDto getStorageSetting() {
        return storageSetting;
    }

    public void setStorageSetting(IsapTableStorageSettingDto storageSetting) {
        this.storageSetting = storageSetting;
    }

    public UpdateTableRequestBody withDisplaySetting(IsapTableDisplaySettingDto displaySetting) {
        this.displaySetting = displaySetting;
        return this;
    }

    public UpdateTableRequestBody withDisplaySetting(Consumer<IsapTableDisplaySettingDto> displaySettingSetter) {
        if (this.displaySetting == null) {
            this.displaySetting = new IsapTableDisplaySettingDto();
            displaySettingSetter.accept(this.displaySetting);
        }

        return this;
    }

    /**
     * Get displaySetting
     * @return displaySetting
     */
    public IsapTableDisplaySettingDto getDisplaySetting() {
        return displaySetting;
    }

    public void setDisplaySetting(IsapTableDisplaySettingDto displaySetting) {
        this.displaySetting = displaySetting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTableRequestBody that = (UpdateTableRequestBody) obj;
        return Objects.equals(this.tableAlias, that.tableAlias) && Objects.equals(this.tableAliasEn, that.tableAliasEn)
            && Objects.equals(this.tableAliasFr, that.tableAliasFr)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.descriptionEn, that.descriptionEn)
            && Objects.equals(this.descriptionFr, that.descriptionFr) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.directoryEn, that.directoryEn) && Objects.equals(this.directoryFr, that.directoryFr)
            && Objects.equals(this.storageSetting, that.storageSetting)
            && Objects.equals(this.displaySetting, that.displaySetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableAlias,
            tableAliasEn,
            tableAliasFr,
            description,
            descriptionEn,
            descriptionFr,
            directory,
            directoryEn,
            directoryFr,
            storageSetting,
            displaySetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTableRequestBody {\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    tableAliasEn: ").append(toIndentedString(tableAliasEn)).append("\n");
        sb.append("    tableAliasFr: ").append(toIndentedString(tableAliasFr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    descriptionFr: ").append(toIndentedString(descriptionFr)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    directoryEn: ").append(toIndentedString(directoryEn)).append("\n");
        sb.append("    directoryFr: ").append(toIndentedString(directoryFr)).append("\n");
        sb.append("    storageSetting: ").append(toIndentedString(storageSetting)).append("\n");
        sb.append("    displaySetting: ").append(toIndentedString(displaySetting)).append("\n");
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
