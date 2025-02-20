package com.huaweicloud.sdk.smnglobal.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserRequestBody;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.DeleteSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.DeleteSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.ListSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.ListSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserRequestBody;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserResponse;

@SuppressWarnings("unchecked")
public class SmnglobalMeta {

    public static final HttpRequestDef<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse> createSubscriptionUser =
        genForCreateSubscriptionUser();

    private static HttpRequestDef<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse> genForCreateSubscriptionUser() {
        // basic
        HttpRequestDef.Builder<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSubscriptionUserRequest.class, CreateSubscriptionUserResponse.class)
            .withName("CreateSubscriptionUser")
            .withUri("/v2/{domain_id}/subscription-users")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSubscriptionUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubscriptionUserRequestBody.class),
            f -> f.withMarshaller(CreateSubscriptionUserRequest::getBody, CreateSubscriptionUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse> deleteSubscriptionUser =
        genForDeleteSubscriptionUser();

    private static HttpRequestDef<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse> genForDeleteSubscriptionUser() {
        // basic
        HttpRequestDef.Builder<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSubscriptionUserRequest.class, DeleteSubscriptionUserResponse.class)
            .withName("DeleteSubscriptionUser")
            .withUri("/v2/{domain_id}/subscription-users/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionUserRequest::getId, DeleteSubscriptionUserRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionUserRequest, ListSubscriptionUserResponse> listSubscriptionUser =
        genForListSubscriptionUser();

    private static HttpRequestDef<ListSubscriptionUserRequest, ListSubscriptionUserResponse> genForListSubscriptionUser() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionUserRequest, ListSubscriptionUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSubscriptionUserRequest.class, ListSubscriptionUserResponse.class)
            .withName("ListSubscriptionUser")
            .withUri("/v2/{domain_id}/subscription-users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionUserRequest::getName, ListSubscriptionUserRequest::setName));
        builder.<ListSubscriptionUserRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubscriptionUserRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListSubscriptionUserRequest::getProtocol, ListSubscriptionUserRequest::setProtocol));
        builder.<ListSubscriptionUserRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubscriptionUserRequest.StatusEnum.class),
            f -> f.withMarshaller(ListSubscriptionUserRequest::getStatus, ListSubscriptionUserRequest::setStatus));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionUserRequest::getGroup, ListSubscriptionUserRequest::setGroup));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionUserRequest::getOffset, ListSubscriptionUserRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionUserRequest::getLimit, ListSubscriptionUserRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse> updateSubscriptionUser =
        genForUpdateSubscriptionUser();

    private static HttpRequestDef<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse> genForUpdateSubscriptionUser() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSubscriptionUserRequest.class, UpdateSubscriptionUserResponse.class)
            .withName("UpdateSubscriptionUser")
            .withUri("/v2/{domain_id}/subscription-users/{id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionUserRequest::getId, UpdateSubscriptionUserRequest::setId));
        builder.<UpdateSubscriptionUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubscriptionUserRequestBody.class),
            f -> f.withMarshaller(UpdateSubscriptionUserRequest::getBody, UpdateSubscriptionUserRequest::setBody));

        // response

        return builder.build();
    }

}
