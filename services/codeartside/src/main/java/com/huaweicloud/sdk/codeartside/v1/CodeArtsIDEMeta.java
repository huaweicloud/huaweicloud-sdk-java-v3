package com.huaweicloud.sdk.codeartside.v1;

import com.huaweicloud.sdk.codeartside.v1.model.ShowLatestUpgradableReleaseRequest;
import com.huaweicloud.sdk.codeartside.v1.model.ShowLatestUpgradableReleaseResponse;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserRequest;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserRequestBody;
import com.huaweicloud.sdk.codeartside.v1.model.ValidateWhitelistUserResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsIDEMeta {

    public static final HttpRequestDef<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse> showLatestUpgradableRelease =
        genForShowLatestUpgradableRelease();

    private static HttpRequestDef<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse> genForShowLatestUpgradableRelease() {
        // basic
        HttpRequestDef.Builder<ShowLatestUpgradableReleaseRequest, ShowLatestUpgradableReleaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestUpgradableReleaseRequest.class,
                    ShowLatestUpgradableReleaseResponse.class)
                .withName("ShowLatestUpgradableRelease")
                .withUri("/v1/release-info/latest")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_product_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestUpgradableReleaseRequest::getSubProductName,
                ShowLatestUpgradableReleaseRequest::setSubProductName));
        builder.<ShowLatestUpgradableReleaseRequest.OsTypeEnum>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowLatestUpgradableReleaseRequest.OsTypeEnum.class),
            f -> f.withMarshaller(ShowLatestUpgradableReleaseRequest::getOsType,
                ShowLatestUpgradableReleaseRequest::setOsType));
        builder.<ShowLatestUpgradableReleaseRequest.ArchEnum>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowLatestUpgradableReleaseRequest.ArchEnum.class),
            f -> f.withMarshaller(ShowLatestUpgradableReleaseRequest::getArch,
                ShowLatestUpgradableReleaseRequest::setArch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse> validateWhitelistUser =
        genForValidateWhitelistUser();

    private static HttpRequestDef<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse> genForValidateWhitelistUser() {
        // basic
        HttpRequestDef.Builder<ValidateWhitelistUserRequest, ValidateWhitelistUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateWhitelistUserRequest.class, ValidateWhitelistUserResponse.class)
            .withName("ValidateWhitelistUser")
            .withUri("/v1/config/users/check")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ValidateWhitelistUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateWhitelistUserRequestBody.class),
            f -> f.withMarshaller(ValidateWhitelistUserRequest::getBody, ValidateWhitelistUserRequest::setBody));

        // response

        return builder.build();
    }

}
