package com.huaweicloud.sdk.eihealth.v2.model;

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
public class ShowAdmetWithCustomPropsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_props")

    private List<CustomProp> customProps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "props")

    private AdmetPropertyDictWithCustom props;

    public ShowAdmetWithCustomPropsResponse withCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
        return this;
    }

    public ShowAdmetWithCustomPropsResponse addCustomPropsItem(CustomProp customPropsItem) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        this.customProps.add(customPropsItem);
        return this;
    }

    public ShowAdmetWithCustomPropsResponse withCustomProps(Consumer<List<CustomProp>> customPropsSetter) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        customPropsSetter.accept(this.customProps);
        return this;
    }

    /**
     * 用户已开启的自定义属性集合
     * @return customProps
     */
    public List<CustomProp> getCustomProps() {
        return customProps;
    }

    public void setCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
    }

    public ShowAdmetWithCustomPropsResponse withProps(AdmetPropertyDictWithCustom props) {
        this.props = props;
        return this;
    }

    public ShowAdmetWithCustomPropsResponse withProps(Consumer<AdmetPropertyDictWithCustom> propsSetter) {
        if (this.props == null) {
            this.props = new AdmetPropertyDictWithCustom();
            propsSetter.accept(this.props);
        }

        return this;
    }

    /**
     * Get props
     * @return props
     */
    public AdmetPropertyDictWithCustom getProps() {
        return props;
    }

    public void setProps(AdmetPropertyDictWithCustom props) {
        this.props = props;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAdmetWithCustomPropsResponse showAdmetWithCustomPropsResponse = (ShowAdmetWithCustomPropsResponse) o;
        return Objects.equals(this.customProps, showAdmetWithCustomPropsResponse.customProps)
            && Objects.equals(this.props, showAdmetWithCustomPropsResponse.props);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customProps, props);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAdmetWithCustomPropsResponse {\n");
        sb.append("    customProps: ").append(toIndentedString(customProps)).append("\n");
        sb.append("    props: ").append(toIndentedString(props)).append("\n");
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
