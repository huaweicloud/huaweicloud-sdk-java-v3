package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件重定向控制的选项。
 */
public class PoliciesFileAndClipboardFileRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fluid_control_switch_enable")

    private Boolean fluidControlSwitchEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fluid_control_options")

    private PoliciesFileAndClipboardFileRedirectionOptionsFluidControlOptions fluidControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression_switch_enable")

    private Boolean compressionSwitchEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression_switch_options")

    private PoliciesFileAndClipboardFileRedirectionOptionsCompressionSwitchOptions compressionSwitchOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_file_size_supported_enable")

    private Boolean linuxFileSizeSupportedEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_file_size_supported_options")

    private PoliciesFileAndClipboardFileRedirectionOptionsLinuxFileSizeSupportedOptions linuxFileSizeSupportedOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_root_mount_switch_enable")

    private Boolean linuxRootMountSwitchEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_root_dir_list")

    private String linuxRootDirList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_file_mount_path")

    private String linuxFileMountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_fixed_drive_file_system_format")

    private String linuxFixedDriveFileSystemFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_removable_drive_file_system_format")

    private String linuxRemovableDriveFileSystemFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_cdrom_drive_file_system_format")

    private String linuxCdromDriveFileSystemFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_network_drive_file_system_format")

    private String linuxNetworkDriveFileSystemFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_separator")

    private String pathSeparator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_drive_enable")

    private Boolean fixedDriveEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removable_drive_enable")

    private Boolean removableDriveEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cd_rom_drive_enable")

    private Boolean cdRomDriveEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_drive_enable")

    private Boolean networkDriveEnable;

    public PoliciesFileAndClipboardFileRedirectionOptions withFluidControlSwitchEnable(
        Boolean fluidControlSwitchEnable) {
        this.fluidControlSwitchEnable = fluidControlSwitchEnable;
        return this;
    }

    /**
     * 是否开启流控开关。取值为： false：表示关闭。 true：表示开启。
     * @return fluidControlSwitchEnable
     */
    public Boolean getFluidControlSwitchEnable() {
        return fluidControlSwitchEnable;
    }

    public void setFluidControlSwitchEnable(Boolean fluidControlSwitchEnable) {
        this.fluidControlSwitchEnable = fluidControlSwitchEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withFluidControlOptions(
        PoliciesFileAndClipboardFileRedirectionOptionsFluidControlOptions fluidControlOptions) {
        this.fluidControlOptions = fluidControlOptions;
        return this;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withFluidControlOptions(
        Consumer<PoliciesFileAndClipboardFileRedirectionOptionsFluidControlOptions> fluidControlOptionsSetter) {
        if (this.fluidControlOptions == null) {
            this.fluidControlOptions = new PoliciesFileAndClipboardFileRedirectionOptionsFluidControlOptions();
            fluidControlOptionsSetter.accept(this.fluidControlOptions);
        }

        return this;
    }

    /**
     * Get fluidControlOptions
     * @return fluidControlOptions
     */
    public PoliciesFileAndClipboardFileRedirectionOptionsFluidControlOptions getFluidControlOptions() {
        return fluidControlOptions;
    }

    public void setFluidControlOptions(
        PoliciesFileAndClipboardFileRedirectionOptionsFluidControlOptions fluidControlOptions) {
        this.fluidControlOptions = fluidControlOptions;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withCompressionSwitchEnable(Boolean compressionSwitchEnable) {
        this.compressionSwitchEnable = compressionSwitchEnable;
        return this;
    }

    /**
     * 是否开启压缩开关。取值为： false：表示关闭。 true：表示开启。
     * @return compressionSwitchEnable
     */
    public Boolean getCompressionSwitchEnable() {
        return compressionSwitchEnable;
    }

    public void setCompressionSwitchEnable(Boolean compressionSwitchEnable) {
        this.compressionSwitchEnable = compressionSwitchEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withCompressionSwitchOptions(
        PoliciesFileAndClipboardFileRedirectionOptionsCompressionSwitchOptions compressionSwitchOptions) {
        this.compressionSwitchOptions = compressionSwitchOptions;
        return this;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withCompressionSwitchOptions(
        Consumer<PoliciesFileAndClipboardFileRedirectionOptionsCompressionSwitchOptions> compressionSwitchOptionsSetter) {
        if (this.compressionSwitchOptions == null) {
            this.compressionSwitchOptions =
                new PoliciesFileAndClipboardFileRedirectionOptionsCompressionSwitchOptions();
            compressionSwitchOptionsSetter.accept(this.compressionSwitchOptions);
        }

        return this;
    }

    /**
     * Get compressionSwitchOptions
     * @return compressionSwitchOptions
     */
    public PoliciesFileAndClipboardFileRedirectionOptionsCompressionSwitchOptions getCompressionSwitchOptions() {
        return compressionSwitchOptions;
    }

    public void setCompressionSwitchOptions(
        PoliciesFileAndClipboardFileRedirectionOptionsCompressionSwitchOptions compressionSwitchOptions) {
        this.compressionSwitchOptions = compressionSwitchOptions;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxFileSizeSupportedEnable(
        Boolean linuxFileSizeSupportedEnable) {
        this.linuxFileSizeSupportedEnable = linuxFileSizeSupportedEnable;
        return this;
    }

    /**
     * 是否开启Linux支持设置文件大小。取值为： false：表示关闭。 true：表示开启。
     * @return linuxFileSizeSupportedEnable
     */
    public Boolean getLinuxFileSizeSupportedEnable() {
        return linuxFileSizeSupportedEnable;
    }

    public void setLinuxFileSizeSupportedEnable(Boolean linuxFileSizeSupportedEnable) {
        this.linuxFileSizeSupportedEnable = linuxFileSizeSupportedEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxFileSizeSupportedOptions(
        PoliciesFileAndClipboardFileRedirectionOptionsLinuxFileSizeSupportedOptions linuxFileSizeSupportedOptions) {
        this.linuxFileSizeSupportedOptions = linuxFileSizeSupportedOptions;
        return this;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxFileSizeSupportedOptions(
        Consumer<PoliciesFileAndClipboardFileRedirectionOptionsLinuxFileSizeSupportedOptions> linuxFileSizeSupportedOptionsSetter) {
        if (this.linuxFileSizeSupportedOptions == null) {
            this.linuxFileSizeSupportedOptions =
                new PoliciesFileAndClipboardFileRedirectionOptionsLinuxFileSizeSupportedOptions();
            linuxFileSizeSupportedOptionsSetter.accept(this.linuxFileSizeSupportedOptions);
        }

        return this;
    }

    /**
     * Get linuxFileSizeSupportedOptions
     * @return linuxFileSizeSupportedOptions
     */
    public PoliciesFileAndClipboardFileRedirectionOptionsLinuxFileSizeSupportedOptions getLinuxFileSizeSupportedOptions() {
        return linuxFileSizeSupportedOptions;
    }

    public void setLinuxFileSizeSupportedOptions(
        PoliciesFileAndClipboardFileRedirectionOptionsLinuxFileSizeSupportedOptions linuxFileSizeSupportedOptions) {
        this.linuxFileSizeSupportedOptions = linuxFileSizeSupportedOptions;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxRootMountSwitchEnable(
        Boolean linuxRootMountSwitchEnable) {
        this.linuxRootMountSwitchEnable = linuxRootMountSwitchEnable;
        return this;
    }

    /**
     * 是否开启Linux根目录挂载开关。取值为： false：表示关闭。 true：表示开启。
     * @return linuxRootMountSwitchEnable
     */
    public Boolean getLinuxRootMountSwitchEnable() {
        return linuxRootMountSwitchEnable;
    }

    public void setLinuxRootMountSwitchEnable(Boolean linuxRootMountSwitchEnable) {
        this.linuxRootMountSwitchEnable = linuxRootMountSwitchEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxRootDirList(String linuxRootDirList) {
        this.linuxRootDirList = linuxRootDirList;
        return this;
    }

    /**
     * Linux根目录挂载路径。默认：\"\\home\"。
     * @return linuxRootDirList
     */
    public String getLinuxRootDirList() {
        return linuxRootDirList;
    }

    public void setLinuxRootDirList(String linuxRootDirList) {
        this.linuxRootDirList = linuxRootDirList;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxFileMountPath(String linuxFileMountPath) {
        this.linuxFileMountPath = linuxFileMountPath;
        return this;
    }

    /**
     * Linux文件系统挂载路径。默认：\"\\media|\\Volumes|\\swdb\\mnt|\\home|\\storage|\\tmp|\\run\\media\"。
     * @return linuxFileMountPath
     */
    public String getLinuxFileMountPath() {
        return linuxFileMountPath;
    }

    public void setLinuxFileMountPath(String linuxFileMountPath) {
        this.linuxFileMountPath = linuxFileMountPath;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxFixedDriveFileSystemFormat(
        String linuxFixedDriveFileSystemFormat) {
        this.linuxFixedDriveFileSystemFormat = linuxFixedDriveFileSystemFormat;
        return this;
    }

    /**
     * Linux固定驱动器文件系统格式。
     * @return linuxFixedDriveFileSystemFormat
     */
    public String getLinuxFixedDriveFileSystemFormat() {
        return linuxFixedDriveFileSystemFormat;
    }

    public void setLinuxFixedDriveFileSystemFormat(String linuxFixedDriveFileSystemFormat) {
        this.linuxFixedDriveFileSystemFormat = linuxFixedDriveFileSystemFormat;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxRemovableDriveFileSystemFormat(
        String linuxRemovableDriveFileSystemFormat) {
        this.linuxRemovableDriveFileSystemFormat = linuxRemovableDriveFileSystemFormat;
        return this;
    }

    /**
     * Linux可移动驱动器文件系统格式。默认：\"vfat|ntfs|msdos|fuseblk|sdcardfs|exfat|fuse.fdredir\"。
     * @return linuxRemovableDriveFileSystemFormat
     */
    public String getLinuxRemovableDriveFileSystemFormat() {
        return linuxRemovableDriveFileSystemFormat;
    }

    public void setLinuxRemovableDriveFileSystemFormat(String linuxRemovableDriveFileSystemFormat) {
        this.linuxRemovableDriveFileSystemFormat = linuxRemovableDriveFileSystemFormat;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxCdromDriveFileSystemFormat(
        String linuxCdromDriveFileSystemFormat) {
        this.linuxCdromDriveFileSystemFormat = linuxCdromDriveFileSystemFormat;
        return this;
    }

    /**
     * Linux光盘驱动器文件系统格式。默认：\"cd9660|iso9660|udf\"。
     * @return linuxCdromDriveFileSystemFormat
     */
    public String getLinuxCdromDriveFileSystemFormat() {
        return linuxCdromDriveFileSystemFormat;
    }

    public void setLinuxCdromDriveFileSystemFormat(String linuxCdromDriveFileSystemFormat) {
        this.linuxCdromDriveFileSystemFormat = linuxCdromDriveFileSystemFormat;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withLinuxNetworkDriveFileSystemFormat(
        String linuxNetworkDriveFileSystemFormat) {
        this.linuxNetworkDriveFileSystemFormat = linuxNetworkDriveFileSystemFormat;
        return this;
    }

    /**
     * Linux网络驱动器文件系统格式。默认：\"smbfs|afpfs|cifs\"。
     * @return linuxNetworkDriveFileSystemFormat
     */
    public String getLinuxNetworkDriveFileSystemFormat() {
        return linuxNetworkDriveFileSystemFormat;
    }

    public void setLinuxNetworkDriveFileSystemFormat(String linuxNetworkDriveFileSystemFormat) {
        this.linuxNetworkDriveFileSystemFormat = linuxNetworkDriveFileSystemFormat;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator;
        return this;
    }

    /**
     * 路径分隔符。默认：\"|\"。
     * @return pathSeparator
     */
    public String getPathSeparator() {
        return pathSeparator;
    }

    public void setPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withFixedDriveEnable(Boolean fixedDriveEnable) {
        this.fixedDriveEnable = fixedDriveEnable;
        return this;
    }

    /**
     * 是否开启固定驱动器（如: 本地磁盘）。取值为： false：表示关闭。 true：表示开启。
     * @return fixedDriveEnable
     */
    public Boolean getFixedDriveEnable() {
        return fixedDriveEnable;
    }

    public void setFixedDriveEnable(Boolean fixedDriveEnable) {
        this.fixedDriveEnable = fixedDriveEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withRemovableDriveEnable(Boolean removableDriveEnable) {
        this.removableDriveEnable = removableDriveEnable;
        return this;
    }

    /**
     * 是否开启可移除驱动器（如: U盘）。取值为： false：表示关闭。 true：表示开启。
     * @return removableDriveEnable
     */
    public Boolean getRemovableDriveEnable() {
        return removableDriveEnable;
    }

    public void setRemovableDriveEnable(Boolean removableDriveEnable) {
        this.removableDriveEnable = removableDriveEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withCdRomDriveEnable(Boolean cdRomDriveEnable) {
        this.cdRomDriveEnable = cdRomDriveEnable;
        return this;
    }

    /**
     * 是否开启光盘驱动器。取值为： false：表示关闭。 true：表示开启。
     * @return cdRomDriveEnable
     */
    public Boolean getCdRomDriveEnable() {
        return cdRomDriveEnable;
    }

    public void setCdRomDriveEnable(Boolean cdRomDriveEnable) {
        this.cdRomDriveEnable = cdRomDriveEnable;
    }

    public PoliciesFileAndClipboardFileRedirectionOptions withNetworkDriveEnable(Boolean networkDriveEnable) {
        this.networkDriveEnable = networkDriveEnable;
        return this;
    }

    /**
     * 是否开启网络驱动器。取值为： false：表示关闭。 true：表示开启。
     * @return networkDriveEnable
     */
    public Boolean getNetworkDriveEnable() {
        return networkDriveEnable;
    }

    public void setNetworkDriveEnable(Boolean networkDriveEnable) {
        this.networkDriveEnable = networkDriveEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesFileAndClipboardFileRedirectionOptions that = (PoliciesFileAndClipboardFileRedirectionOptions) obj;
        return Objects.equals(this.fluidControlSwitchEnable, that.fluidControlSwitchEnable)
            && Objects.equals(this.fluidControlOptions, that.fluidControlOptions)
            && Objects.equals(this.compressionSwitchEnable, that.compressionSwitchEnable)
            && Objects.equals(this.compressionSwitchOptions, that.compressionSwitchOptions)
            && Objects.equals(this.linuxFileSizeSupportedEnable, that.linuxFileSizeSupportedEnable)
            && Objects.equals(this.linuxFileSizeSupportedOptions, that.linuxFileSizeSupportedOptions)
            && Objects.equals(this.linuxRootMountSwitchEnable, that.linuxRootMountSwitchEnable)
            && Objects.equals(this.linuxRootDirList, that.linuxRootDirList)
            && Objects.equals(this.linuxFileMountPath, that.linuxFileMountPath)
            && Objects.equals(this.linuxFixedDriveFileSystemFormat, that.linuxFixedDriveFileSystemFormat)
            && Objects.equals(this.linuxRemovableDriveFileSystemFormat, that.linuxRemovableDriveFileSystemFormat)
            && Objects.equals(this.linuxCdromDriveFileSystemFormat, that.linuxCdromDriveFileSystemFormat)
            && Objects.equals(this.linuxNetworkDriveFileSystemFormat, that.linuxNetworkDriveFileSystemFormat)
            && Objects.equals(this.pathSeparator, that.pathSeparator)
            && Objects.equals(this.fixedDriveEnable, that.fixedDriveEnable)
            && Objects.equals(this.removableDriveEnable, that.removableDriveEnable)
            && Objects.equals(this.cdRomDriveEnable, that.cdRomDriveEnable)
            && Objects.equals(this.networkDriveEnable, that.networkDriveEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fluidControlSwitchEnable,
            fluidControlOptions,
            compressionSwitchEnable,
            compressionSwitchOptions,
            linuxFileSizeSupportedEnable,
            linuxFileSizeSupportedOptions,
            linuxRootMountSwitchEnable,
            linuxRootDirList,
            linuxFileMountPath,
            linuxFixedDriveFileSystemFormat,
            linuxRemovableDriveFileSystemFormat,
            linuxCdromDriveFileSystemFormat,
            linuxNetworkDriveFileSystemFormat,
            pathSeparator,
            fixedDriveEnable,
            removableDriveEnable,
            cdRomDriveEnable,
            networkDriveEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboardFileRedirectionOptions {\n");
        sb.append("    fluidControlSwitchEnable: ").append(toIndentedString(fluidControlSwitchEnable)).append("\n");
        sb.append("    fluidControlOptions: ").append(toIndentedString(fluidControlOptions)).append("\n");
        sb.append("    compressionSwitchEnable: ").append(toIndentedString(compressionSwitchEnable)).append("\n");
        sb.append("    compressionSwitchOptions: ").append(toIndentedString(compressionSwitchOptions)).append("\n");
        sb.append("    linuxFileSizeSupportedEnable: ")
            .append(toIndentedString(linuxFileSizeSupportedEnable))
            .append("\n");
        sb.append("    linuxFileSizeSupportedOptions: ")
            .append(toIndentedString(linuxFileSizeSupportedOptions))
            .append("\n");
        sb.append("    linuxRootMountSwitchEnable: ").append(toIndentedString(linuxRootMountSwitchEnable)).append("\n");
        sb.append("    linuxRootDirList: ").append(toIndentedString(linuxRootDirList)).append("\n");
        sb.append("    linuxFileMountPath: ").append(toIndentedString(linuxFileMountPath)).append("\n");
        sb.append("    linuxFixedDriveFileSystemFormat: ")
            .append(toIndentedString(linuxFixedDriveFileSystemFormat))
            .append("\n");
        sb.append("    linuxRemovableDriveFileSystemFormat: ")
            .append(toIndentedString(linuxRemovableDriveFileSystemFormat))
            .append("\n");
        sb.append("    linuxCdromDriveFileSystemFormat: ")
            .append(toIndentedString(linuxCdromDriveFileSystemFormat))
            .append("\n");
        sb.append("    linuxNetworkDriveFileSystemFormat: ")
            .append(toIndentedString(linuxNetworkDriveFileSystemFormat))
            .append("\n");
        sb.append("    pathSeparator: ").append(toIndentedString(pathSeparator)).append("\n");
        sb.append("    fixedDriveEnable: ").append(toIndentedString(fixedDriveEnable)).append("\n");
        sb.append("    removableDriveEnable: ").append(toIndentedString(removableDriveEnable)).append("\n");
        sb.append("    cdRomDriveEnable: ").append(toIndentedString(cdRomDriveEnable)).append("\n");
        sb.append("    networkDriveEnable: ").append(toIndentedString(networkDriveEnable)).append("\n");
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
