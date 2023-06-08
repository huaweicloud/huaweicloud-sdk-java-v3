package com.huaweicloud.sdk.eds.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eds.v1.model.*;

@SuppressWarnings("unchecked")
public class EdsMeta {

    public static final HttpRequestDef<CancelContractRequest, CancelContractResponse> cancelContract =
        genForcancelContract();

    private static HttpRequestDef<CancelContractRequest, CancelContractResponse> genForcancelContract() {
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
            f -> f.withMarshaller(CancelContractRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelContractRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("contract_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelContractRequest::getContractId, (req, v) -> {
                req.setContractId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitContractRequest, CommitContractResponse> commitContract =
        genForcommitContract();

    private static HttpRequestDef<CommitContractRequest, CommitContractResponse> genForcommitContract() {
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
            f -> f.withMarshaller(CommitContractRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitContractRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<ContractReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContractReq.class),
            f -> f.withMarshaller(CommitContractRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> listConnectorsByInstanceManger =
        genForlistConnectorsByInstanceManger();

    private static HttpRequestDef<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> genForlistConnectorsByInstanceManger() {
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
            f -> f.withMarshaller(ListConnectorsByInstanceMangerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceMangerRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceMangerRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> listConnectorsByInstanceUser =
        genForlistConnectorsByInstanceUser();

    private static HttpRequestDef<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> genForlistConnectorsByInstanceUser() {
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
            f -> f.withMarshaller(ListConnectorsByInstanceUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceUserRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorsByInstanceUserRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLog = genForshowAuditLog();

    private static HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> genForshowAuditLog() {
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
            f -> f.withMarshaller(ShowAuditLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("connector_keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getConnectorKeywords, (req, v) -> {
                req.setConnectorKeywords(v);
            }));
        builder.<String>withRequestField("user_keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getUserKeywords, (req, v) -> {
                req.setUserKeywords(v);
            }));
        builder.<ShowAuditLogRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAuditLogRequest.ActionEnum.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectorRequest, ShowConnectorResponse> showConnector =
        genForshowConnector();

    private static HttpRequestDef<ShowConnectorRequest, ShowConnectorResponse> genForshowConnector() {
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
            f -> f.withMarshaller(ShowConnectorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContractRequest, ShowContractResponse> showContract = genForshowContract();

    private static HttpRequestDef<ShowContractRequest, ShowContractResponse> genForshowContract() {
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
            f -> f.withMarshaller(ShowContractRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContractRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("contract_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContractRequest::getContractId, (req, v) -> {
                req.setContractId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffersRequest, ListOffersResponse> listOffers = genForlistOffers();

    private static HttpRequestDef<ListOffersRequest, ListOffersResponse> genForlistOffers() {
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
            f -> f.withMarshaller(ListOffersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffersRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<OfferPage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OfferPage.class),
            f -> f.withMarshaller(ListOffersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOfferRequest, ShowOfferResponse> showOffer = genForshowOffer();

    private static HttpRequestDef<ShowOfferRequest, ShowOfferResponse> genForshowOffer() {
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
            f -> f.withMarshaller(ShowOfferRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOfferRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("offer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOfferRequest::getOfferId, (req, v) -> {
                req.setOfferId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddConnectorUserRequest, AddConnectorUserResponse> addConnectorUser =
        genForaddConnectorUser();

    private static HttpRequestDef<AddConnectorUserRequest, AddConnectorUserResponse> genForaddConnectorUser() {
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
            f -> f.withMarshaller(AddConnectorUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddConnectorUserRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<UserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UserReq.class),
            f -> f.withMarshaller(AddConnectorUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectorUserRequest, DeleteConnectorUserResponse> deleteConnectorUser =
        genFordeleteConnectorUser();

    private static HttpRequestDef<DeleteConnectorUserRequest, DeleteConnectorUserResponse> genFordeleteConnectorUser() {
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
            f -> f.withMarshaller(DeleteConnectorUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorUserRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

}
