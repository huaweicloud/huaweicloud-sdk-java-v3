package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ntp配置 */
public class NtpConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ntp_enabled")

    private Boolean ntpEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ntpservers")

    private List<String> ntpservers = null;

    public NtpConfigs withNtpEnabled(Boolean ntpEnabled) {
        this.ntpEnabled = ntpEnabled;
        return this;
    }

    /** ntp服务是否开启
     * 
     * @return ntpEnabled */
    public Boolean getNtpEnabled() {
        return ntpEnabled;
    }

    public void setNtpEnabled(Boolean ntpEnabled) {
        this.ntpEnabled = ntpEnabled;
    }

    public NtpConfigs withNtpservers(List<String> ntpservers) {
        this.ntpservers = ntpservers;
        return this;
    }

    public NtpConfigs addNtpserversItem(String ntpserversItem) {
        if (this.ntpservers == null) {
            this.ntpservers = new ArrayList<>();
        }
        this.ntpservers.add(ntpserversItem);
        return this;
    }

    public NtpConfigs withNtpservers(Consumer<List<String>> ntpserversSetter) {
        if (this.ntpservers == null) {
            this.ntpservers = new ArrayList<>();
        }
        ntpserversSetter.accept(this.ntpservers);
        return this;
    }

    /** ntp server地址
     * 
     * @return ntpservers */
    public List<String> getNtpservers() {
        return ntpservers;
    }

    public void setNtpservers(List<String> ntpservers) {
        this.ntpservers = ntpservers;
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
            && Objects.equals(this.ntpservers, ntpConfigs.ntpservers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ntpEnabled, ntpservers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NtpConfigs {\n");
        sb.append("    ntpEnabled: ").append(toIndentedString(ntpEnabled)).append("\n");
        sb.append("    ntpservers: ").append(toIndentedString(ntpservers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
