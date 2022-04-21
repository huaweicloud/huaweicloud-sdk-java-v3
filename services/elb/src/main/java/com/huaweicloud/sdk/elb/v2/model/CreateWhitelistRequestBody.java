package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateWhitelistRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private CreateWhitelistReq whitelist;

    public CreateWhitelistRequestBody withWhitelist(CreateWhitelistReq whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public CreateWhitelistRequestBody withWhitelist(Consumer<CreateWhitelistReq> whitelistSetter) {
        if (this.whitelist == null) {
            this.whitelist = new CreateWhitelistReq();
            whitelistSetter.accept(this.whitelist);
        }

        return this;
    }

    /**
     * Get whitelist
     * @return whitelist
     */
    public CreateWhitelistReq getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(CreateWhitelistReq whitelist) {
        this.whitelist = whitelist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWhitelistRequestBody createWhitelistRequestBody = (CreateWhitelistRequestBody) o;
        return Objects.equals(this.whitelist, createWhitelistRequestBody.whitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWhitelistRequestBody {\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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
