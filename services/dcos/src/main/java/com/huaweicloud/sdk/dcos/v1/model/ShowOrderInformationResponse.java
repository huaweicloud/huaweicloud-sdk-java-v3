package com.huaweicloud.sdk.dcos.v1.model;

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
public class ShowOrderInformationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private List<UserPhone> phone = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sop")

    private List<DefaultSop> sop = null;

    public ShowOrderInformationResponse withPhone(List<UserPhone> phone) {
        this.phone = phone;
        return this;
    }

    public ShowOrderInformationResponse addPhoneItem(UserPhone phoneItem) {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    public ShowOrderInformationResponse withPhone(Consumer<List<UserPhone>> phoneSetter) {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        phoneSetter.accept(this.phone);
        return this;
    }

    /**
     * 联系号码
     * @return phone
     */
    public List<UserPhone> getPhone() {
        return phone;
    }

    public void setPhone(List<UserPhone> phone) {
        this.phone = phone;
    }

    public ShowOrderInformationResponse withSop(List<DefaultSop> sop) {
        this.sop = sop;
        return this;
    }

    public ShowOrderInformationResponse addSopItem(DefaultSop sopItem) {
        if (this.sop == null) {
            this.sop = new ArrayList<>();
        }
        this.sop.add(sopItem);
        return this;
    }

    public ShowOrderInformationResponse withSop(Consumer<List<DefaultSop>> sopSetter) {
        if (this.sop == null) {
            this.sop = new ArrayList<>();
        }
        sopSetter.accept(this.sop);
        return this;
    }

    /**
     * sop信息
     * @return sop
     */
    public List<DefaultSop> getSop() {
        return sop;
    }

    public void setSop(List<DefaultSop> sop) {
        this.sop = sop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrderInformationResponse that = (ShowOrderInformationResponse) obj;
        return Objects.equals(this.phone, that.phone) && Objects.equals(this.sop, that.sop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, sop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrderInformationResponse {\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    sop: ").append(toIndentedString(sop)).append("\n");
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
