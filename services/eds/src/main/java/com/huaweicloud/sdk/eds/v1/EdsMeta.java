package com.huaweicloud.sdk.eds.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eds.v1.model.AddConnectorUserRequest;
import com.huaweicloud.sdk.eds.v1.model.AddConnectorUserResponse;
import com.huaweicloud.sdk.eds.v1.model.CancelContractRequest;
import com.huaweicloud.sdk.eds.v1.model.CancelContractResponse;
import com.huaweicloud.sdk.eds.v1.model.CommitContractRequest;
import com.huaweicloud.sdk.eds.v1.model.CommitContractResponse;
import com.huaweicloud.sdk.eds.v1.model.ContractReq;
import com.huaweicloud.sdk.eds.v1.model.DeleteConnectorUserRequest;
import com.huaweicloud.sdk.eds.v1.model.DeleteConnectorUserResponse;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceMangerRequest;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceMangerResponse;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceUserRequest;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceUserResponse;
import com.huaweicloud.sdk.eds.v1.model.ListOffersRequest;
import com.huaweicloud.sdk.eds.v1.model.ListOffersResponse;
import com.huaweicloud.sdk.eds.v1.model.OfferPage;
import com.huaweicloud.sdk.eds.v1.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowConnectorRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowConnectorResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowContractRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowContractResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowOfferRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowOfferResponse;
import com.huaweicloud.sdk.eds.v1.model.UserReq;

@SuppressWarnings("unchecked")
public class EdsMeta {

    public static final HttpRequestDef<CancelContractRequest, CancelContractResponse> cancelContract =
        genForCancelContract();

    private static HttpRequestDef<CancelContractRequest, CancelContractResponse> genForCancelContract() {
        // basic
        HttpRequestDef.Builder<CancelContractRequest, CancelContractResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelContractRequest.class, CancelContractResponse.class)
                .withName("CancelContract")
                .withUri(
                    "/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/contracts/{contract_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelContractRequest::getInstanceId, CancelContractRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelContractRequest::getConnectorId, CancelContractRequest::setConnectorId));
        builder.<String>withRequestField("contract_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelContractRequest::getContractId, CancelContractRequest::setContractId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitContractRequest, CommitContractResponse> commitContract =
        genForCommitContract();

    private static HttpRequestDef<CommitContractRequest, CommitContractResponse> genForCommitContract() {
        // basic
        HttpRequestDef.Builder<CommitContractRequest, CommitContractResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CommitContractRequest.class, CommitContractResponse.class)
                .withName("CommitContract")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/contracts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitContractRequest::getInstanceId, CommitContractRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitContractRequest::getConnectorId, CommitContractRequest::setConnectorId));
        builder.<ContractReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContractReq.class),
            f -> f.withMarshaller(CommitContractRequest::getBody, CommitContractRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> listConnectorsByInstanceManger =
        genForListConnectorsByInstanceManger();

    private static HttpRequestDef<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> genForListConnectorsByInstanceManger() {
        // basic
        HttpRequestDef.Builder<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConnectorsByInstanceMangerRequest.class,
                    ListConnectorsByInstanceMangerResponse.class)
                .withName("ListConnectorsByInstanceManger")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectorsByInstanceMangerRequest::getInstanceId,
                ListConnectorsByInstanceMangerRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceMangerRequest::getOffset,
                ListConnectorsByInstanceMangerRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceMangerRequest::getLimit,
                ListConnectorsByInstanceMangerRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> listConnectorsByInstanceUser =
        genForListConnectorsByInstanceUser();

    private static HttpRequestDef<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> genForListConnectorsByInstanceUser() {
        // basic
        HttpRequestDef.Builder<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConnectorsByInstanceUserRequest.class,
                    ListConnectorsByInstanceUserResponse.class)
                .withName("ListConnectorsByInstanceUser")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/user-connectors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectorsByInstanceUserRequest::getInstanceId,
                ListConnectorsByInstanceUserRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceUserRequest::getOffset,
                ListConnectorsByInstanceUserRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceUserRequest::getLimit,
                ListConnectorsByInstanceUserRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLog = genForShowAuditLog();

    private static HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> genForShowAuditLog() {
        // basic
        HttpRequestDef.Builder<ShowAuditLogRequest, ShowAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditLogRequest.class, ShowAuditLogResponse.class)
                .withName("ShowAuditLog")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/audit-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getInstanceId, ShowAuditLogRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getConnectorId, ShowAuditLogRequest::setConnectorId));
        builder.<String>withRequestField("connector_keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getConnectorKeywords,
                ShowAuditLogRequest::setConnectorKeywords));
        builder.<String>withRequestField("user_keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getUserKeywords, ShowAuditLogRequest::setUserKeywords));
        builder.<ShowAuditLogRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAuditLogRequest.ActionEnum.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getAction, ShowAuditLogRequest::setAction));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getStartTime, ShowAuditLogRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getEndTime, ShowAuditLogRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getOffset, ShowAuditLogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getLimit, ShowAuditLogRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectorRequest, ShowConnectorResponse> showConnector =
        genForShowConnector();

    private static HttpRequestDef<ShowConnectorRequest, ShowConnectorResponse> genForShowConnector() {
        // basic
        HttpRequestDef.Builder<ShowConnectorRequest, ShowConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectorRequest.class, ShowConnectorResponse.class)
                .withName("ShowConnector")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorRequest::getInstanceId, ShowConnectorRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorRequest::getConnectorId, ShowConnectorRequest::setConnectorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContractRequest, ShowContractResponse> showContract = genForShowContract();

    private static HttpRequestDef<ShowContractRequest, ShowContractResponse> genForShowContract() {
        // basic
        HttpRequestDef.Builder<ShowContractRequest, ShowContractResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowContractRequest.class, ShowContractResponse.class)
                .withName("ShowContract")
                .withUri(
                    "/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/contracts/{contract_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContractRequest::getInstanceId, ShowContractRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContractRequest::getConnectorId, ShowContractRequest::setConnectorId));
        builder.<String>withRequestField("contract_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContractRequest::getContractId, ShowContractRequest::setContractId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffersRequest, ListOffersResponse> listOffers = genForListOffers();

    private static HttpRequestDef<ListOffersRequest, ListOffersResponse> genForListOffers() {
        // basic
        HttpRequestDef.Builder<ListOffersRequest, ListOffersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListOffersRequest.class, ListOffersResponse.class)
                .withName("ListOffers")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/offers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffersRequest::getInstanceId, ListOffersRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffersRequest::getConnectorId, ListOffersRequest::setConnectorId));
        builder.<OfferPage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OfferPage.class),
            f -> f.withMarshaller(ListOffersRequest::getBody, ListOffersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOfferRequest, ShowOfferResponse> showOffer = genForShowOffer();

    private static HttpRequestDef<ShowOfferRequest, ShowOfferResponse> genForShowOffer() {
        // basic
        HttpRequestDef.Builder<ShowOfferRequest, ShowOfferResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOfferRequest.class, ShowOfferResponse.class)
                .withName("ShowOffer")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/offers/{offer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOfferRequest::getInstanceId, ShowOfferRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOfferRequest::getConnectorId, ShowOfferRequest::setConnectorId));
        builder.<String>withRequestField("offer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOfferRequest::getOfferId, ShowOfferRequest::setOfferId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddConnectorUserRequest, AddConnectorUserResponse> addConnectorUser =
        genForAddConnectorUser();

    private static HttpRequestDef<AddConnectorUserRequest, AddConnectorUserResponse> genForAddConnectorUser() {
        // basic
        HttpRequestDef.Builder<AddConnectorUserRequest, AddConnectorUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddConnectorUserRequest.class, AddConnectorUserResponse.class)
                .withName("AddConnectorUser")
                .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddConnectorUserRequest::getInstanceId, AddConnectorUserRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddConnectorUserRequest::getConnectorId, AddConnectorUserRequest::setConnectorId));
        builder.<UserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UserReq.class),
            f -> f.withMarshaller(AddConnectorUserRequest::getBody, AddConnectorUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectorUserRequest, DeleteConnectorUserResponse> deleteConnectorUser =
        genForDeleteConnectorUser();

    private static HttpRequestDef<DeleteConnectorUserRequest, DeleteConnectorUserResponse> genForDeleteConnectorUser() {
        // basic
        HttpRequestDef.Builder<DeleteConnectorUserRequest, DeleteConnectorUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConnectorUserRequest.class, DeleteConnectorUserResponse.class)
            .withName("DeleteConnectorUser")
            .withUri("/v1/{project_id}/eds/instances/{instance_id}/connectors/{connector_id}/users/{user_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorUserRequest::getInstanceId,
                DeleteConnectorUserRequest::setInstanceId));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorUserRequest::getConnectorId,
                DeleteConnectorUserRequest::setConnectorId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorUserRequest::getUserName, DeleteConnectorUserRequest::setUserName));

        // response

        return builder.build();
    }

}
