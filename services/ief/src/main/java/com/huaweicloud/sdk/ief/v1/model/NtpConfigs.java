package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ntp配置
 */
public class NtpConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ntp_enabled")

    private Boolean ntpEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ntp_servers")

    private List<String> ntpServers = null;

    public NtpConfigs withNtpEnabled(Boolean ntpEnabled) {
        this.ntpEnabled = ntpEnabled;
        return this;
    }

    /**
     * ntp服务是否开启
     * @return ntpEnabled
     */
    public Boolean getNtpEnabled() {
        return ntpEnabled;
    }

    public void setNtpEnabled(Boolean ntpEnabled) {
        this.ntpEnabled = ntpEnabled;
    }

    public NtpConfigs withNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
        return this;
    }

    public NtpConfigs addNtpServersItem(String ntpServersItem) {
        if (this.ntpServers == null) {
            this.ntpServers = new ArrayList<>();
        }
        this.ntpServers.add(ntpServersItem);
        return this;
    }

    public NtpConfigs withNtpServers(Consumer<List<String>> ntpServersSetter) {
        if (this.ntpServers == null) {
            this.ntpServers = new ArrayList<>();
        }
        ntpServersSetter.accept(this.ntpServers);
        return this;
    }

    /**
     * ntp server地址
     * @return ntpServers
     */
    public List<String> getNtpServers() {
        return ntpServers;
    }

    public void setNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NtpConfigs ntpConfigs = (NtpConfigs) o;
        return Objects.equals(this.ntpEnabled, ntpConfigs.ntpEnabled)
            && Objects.equals(this.ntpServers, ntpConfigs.ntpServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ntpEnabled, ntpServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NtpConfigs {\n");
        sb.append("    ntpEnabled: ").append(toIndentedString(ntpEnabled)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
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
