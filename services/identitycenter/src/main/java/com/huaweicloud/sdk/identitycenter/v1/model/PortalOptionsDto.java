package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 门户选项设置
 */
public class PortalOptionsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    /**
     * 应用程序在门户可见性
     */
    public static final class VisibilityEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final VisibilityEnum ENABLED = new VisibilityEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final VisibilityEnum DISABLED = new VisibilityEnum("DISABLED");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_in_options")

    private SignInOptionsDto signInOptions;

    public PortalOptionsDto withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 应用程序在门户是否可见
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public PortalOptionsDto withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 应用程序在门户可见性
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public PortalOptionsDto withSignInOptions(SignInOptionsDto signInOptions) {
        this.signInOptions = signInOptions;
        return this;
    }

    public PortalOptionsDto withSignInOptions(Consumer<SignInOptionsDto> signInOptionsSetter) {
        if (this.signInOptions == null) {
            this.signInOptions = new SignInOptionsDto();
            signInOptionsSetter.accept(this.signInOptions);
        }

        return this;
    }

    /**
     * Get signInOptions
     * @return signInOptions
     */
    public SignInOptionsDto getSignInOptions() {
        return signInOptions;
    }

    public void setSignInOptions(SignInOptionsDto signInOptions) {
        this.signInOptions = signInOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortalOptionsDto that = (PortalOptionsDto) obj;
        return Objects.equals(this.visible, that.visible) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.signInOptions, that.signInOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visible, visibility, signInOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortalOptionsDto {\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    signInOptions: ").append(toIndentedString(signInOptions)).append("\n");
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
