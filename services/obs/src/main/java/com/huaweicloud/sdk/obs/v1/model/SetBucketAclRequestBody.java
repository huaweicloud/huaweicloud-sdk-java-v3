package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetBucketAclRequestBody
 */
@JacksonXmlRootElement(localName = "AccessControlPolicy")
public class SetBucketAclRequestBody extends SdkXmlBody<SetBucketAclRequestBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Owner")

    @JacksonXmlProperty(localName = "Owner")

    private Owner owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "AccessControlList")

    @JacksonXmlProperty(localName = "AccessControlList")

    private AccessControlList accessControlList;

    public SetBucketAclRequestBody withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public SetBucketAclRequestBody withOwner(Consumer<Owner> ownerSetter) {
        if (this.owner == null) {
            this.owner = new Owner();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public SetBucketAclRequestBody withAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public SetBucketAclRequestBody withAccessControlList(Consumer<AccessControlList> accessControlListSetter) {
        if (this.accessControlList == null) {
            this.accessControlList = new AccessControlList();
            accessControlListSetter.accept(this.accessControlList);
        }

        return this;
    }

    /**
     * Get accessControlList
     * @return accessControlList
     */
    public AccessControlList getAccessControlList() {
        return accessControlList;
    }

    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketAclRequestBody that = (SetBucketAclRequestBody) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.accessControlList, that.accessControlList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, accessControlList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketAclRequestBody {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    accessControlList: ").append(toIndentedString(accessControlList)).append("\n");
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
