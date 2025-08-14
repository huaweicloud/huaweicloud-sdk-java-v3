package com.huaweicloud.sdk.identitycenterstore.v1.model;

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
public class BatchListMfaDevicesForUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_mfa_devices_entry_list")

    private List<RetrieveMfaDevicesForUserEntryDto> userMfaDevicesEntryList = null;

    public BatchListMfaDevicesForUserResponse withUserMfaDevicesEntryList(
        List<RetrieveMfaDevicesForUserEntryDto> userMfaDevicesEntryList) {
        this.userMfaDevicesEntryList = userMfaDevicesEntryList;
        return this;
    }

    public BatchListMfaDevicesForUserResponse addUserMfaDevicesEntryListItem(
        RetrieveMfaDevicesForUserEntryDto userMfaDevicesEntryListItem) {
        if (this.userMfaDevicesEntryList == null) {
            this.userMfaDevicesEntryList = new ArrayList<>();
        }
        this.userMfaDevicesEntryList.add(userMfaDevicesEntryListItem);
        return this;
    }

    public BatchListMfaDevicesForUserResponse withUserMfaDevicesEntryList(
        Consumer<List<RetrieveMfaDevicesForUserEntryDto>> userMfaDevicesEntryListSetter) {
        if (this.userMfaDevicesEntryList == null) {
            this.userMfaDevicesEntryList = new ArrayList<>();
        }
        userMfaDevicesEntryListSetter.accept(this.userMfaDevicesEntryList);
        return this;
    }

    /**
     * 用户MFA设备信息列表
     * @return userMfaDevicesEntryList
     */
    public List<RetrieveMfaDevicesForUserEntryDto> getUserMfaDevicesEntryList() {
        return userMfaDevicesEntryList;
    }

    public void setUserMfaDevicesEntryList(List<RetrieveMfaDevicesForUserEntryDto> userMfaDevicesEntryList) {
        this.userMfaDevicesEntryList = userMfaDevicesEntryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListMfaDevicesForUserResponse that = (BatchListMfaDevicesForUserResponse) obj;
        return Objects.equals(this.userMfaDevicesEntryList, that.userMfaDevicesEntryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userMfaDevicesEntryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListMfaDevicesForUserResponse {\n");
        sb.append("    userMfaDevicesEntryList: ").append(toIndentedString(userMfaDevicesEntryList)).append("\n");
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
