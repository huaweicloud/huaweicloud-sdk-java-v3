package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RetrieveMfaDevicesForUserEntryDto
 */
public class RetrieveMfaDevicesForUserEntryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mfa_devices")

    private List<MfaDeviceDto> mfaDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private RetrieveMfaDevicesForUserDto user;

    public RetrieveMfaDevicesForUserEntryDto withMfaDevices(List<MfaDeviceDto> mfaDevices) {
        this.mfaDevices = mfaDevices;
        return this;
    }

    public RetrieveMfaDevicesForUserEntryDto addMfaDevicesItem(MfaDeviceDto mfaDevicesItem) {
        if (this.mfaDevices == null) {
            this.mfaDevices = new ArrayList<>();
        }
        this.mfaDevices.add(mfaDevicesItem);
        return this;
    }

    public RetrieveMfaDevicesForUserEntryDto withMfaDevices(Consumer<List<MfaDeviceDto>> mfaDevicesSetter) {
        if (this.mfaDevices == null) {
            this.mfaDevices = new ArrayList<>();
        }
        mfaDevicesSetter.accept(this.mfaDevices);
        return this;
    }

    /**
     * MFA设备列表
     * @return mfaDevices
     */
    public List<MfaDeviceDto> getMfaDevices() {
        return mfaDevices;
    }

    public void setMfaDevices(List<MfaDeviceDto> mfaDevices) {
        this.mfaDevices = mfaDevices;
    }

    public RetrieveMfaDevicesForUserEntryDto withUser(RetrieveMfaDevicesForUserDto user) {
        this.user = user;
        return this;
    }

    public RetrieveMfaDevicesForUserEntryDto withUser(Consumer<RetrieveMfaDevicesForUserDto> userSetter) {
        if (this.user == null) {
            this.user = new RetrieveMfaDevicesForUserDto();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public RetrieveMfaDevicesForUserDto getUser() {
        return user;
    }

    public void setUser(RetrieveMfaDevicesForUserDto user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetrieveMfaDevicesForUserEntryDto that = (RetrieveMfaDevicesForUserEntryDto) obj;
        return Objects.equals(this.mfaDevices, that.mfaDevices) && Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mfaDevices, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrieveMfaDevicesForUserEntryDto {\n");
        sb.append("    mfaDevices: ").append(toIndentedString(mfaDevices)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
