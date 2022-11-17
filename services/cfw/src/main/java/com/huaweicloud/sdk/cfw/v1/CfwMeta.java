package com.huaweicloud.sdk.cfw.v1;

import com.huaweicloud.sdk.cfw.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CfwMeta {

    public static final HttpRequestDef<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse> addAddressItemsUsingPost =
        genForaddAddressItemsUsingPost();

    private static HttpRequestDef<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse> genForaddAddressItemsUsingPost() {
        // basic
        HttpRequestDef.Builder<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddAddressItemsUsingPostRequest.class, AddAddressItemsUsingPostResponse.class)
                .withName("AddAddressItemsUsingPost")
                .withUri("/v1/{project_id}/address-items")
                .withContentType("application/json");

        // requests
        builder.<AddAddressItemsInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAddressItemsInfoDto.class),
            f -> f.withMarshaller(AddAddressItemsUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse> addAddressSetInfoUsingPost =
        genForaddAddressSetInfoUsingPost();

    private static HttpRequestDef<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse> genForaddAddressSetInfoUsingPost() {
        // basic
        HttpRequestDef.Builder<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddAddressSetInfoUsingPostRequest.class,
                    AddAddressSetInfoUsingPostResponse.class)
                .withName("AddAddressSetInfoUsingPost")
                .withUri("/v1/{project_id}/address-set")
                .withContentType("application/json");

        // requests
        builder.<AddAddressSetDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAddressSetDto.class),
            f -> f.withMarshaller(AddAddressSetInfoUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse> addBlackWhiteListUsingPost =
        genForaddBlackWhiteListUsingPost();

    private static HttpRequestDef<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse> genForaddBlackWhiteListUsingPost() {
        // basic
        HttpRequestDef.Builder<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddBlackWhiteListUsingPostRequest.class,
                    AddBlackWhiteListUsingPostResponse.class)
                .withName("AddBlackWhiteListUsingPost")
                .withUri("/v1/{project_id}/black-white-list")
                .withContentType("application/json");

        // requests
        builder.<AddBlackWhiteListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddBlackWhiteListDto.class),
            f -> f.withMarshaller(AddBlackWhiteListUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse> addServiceItemsUsingPost =
        genForaddServiceItemsUsingPost();

    private static HttpRequestDef<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse> genForaddServiceItemsUsingPost() {
        // basic
        HttpRequestDef.Builder<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddServiceItemsUsingPostRequest.class, AddServiceItemsUsingPostResponse.class)
                .withName("AddServiceItemsUsingPost")
                .withUri("/v1/{project_id}/service-items")
                .withContentType("application/json");

        // requests
        builder.<AddServiceItemsUsingPOSTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServiceItemsUsingPOSTRequestBody.class),
            f -> f.withMarshaller(AddServiceItemsUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse> addServiceSetUsingPost =
        genForaddServiceSetUsingPost();

    private static HttpRequestDef<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse> genForaddServiceSetUsingPost() {
        // basic
        HttpRequestDef.Builder<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddServiceSetUsingPostRequest.class, AddServiceSetUsingPostResponse.class)
            .withName("AddServiceSetUsingPost")
            .withUri("/v1/{project_id}/service-set")
            .withContentType("application/json");

        // requests
        builder.<AddServiceSetUsingPOSTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServiceSetUsingPOSTRequestBody.class),
            f -> f.withMarshaller(AddServiceSetUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse> changeEwProtectStatus =
        genForchangeEwProtectStatus();

    private static HttpRequestDef<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse> genForchangeEwProtectStatus() {
        // basic
        HttpRequestDef.Builder<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeEwProtectStatusRequest.class, ChangeEwProtectStatusResponse.class)
            .withName("ChangeEwProtectStatus")
            .withUri("/v1/{project_id}/firewall/east-west/protect")
            .withContentType("application/json");

        // requests
        builder.<ChangeProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeProtectStatusRequestBody.class),
            f -> f.withMarshaller(ChangeEwProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse> changeIpsProtectModeUsingPost =
        genForchangeIpsProtectModeUsingPost();

    private static HttpRequestDef<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse> genForchangeIpsProtectModeUsingPost() {
        // basic
        HttpRequestDef.Builder<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeIpsProtectModeUsingPostRequest.class,
                    ChangeIpsProtectModeUsingPostResponse.class)
                .withName("ChangeIpsProtectModeUsingPost")
                .withUri("/v1/{project_id}/ips/protect")
                .withContentType("application/json");

        // requests
        builder.<IpsProtectDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsProtectDTO.class),
            f -> f.withMarshaller(ChangeIpsProtectModeUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse> deleteAclRuleCount =
        genFordeleteAclRuleCount();

    private static HttpRequestDef<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse> genFordeleteAclRuleCount() {
        // basic
        HttpRequestDef.Builder<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclRuleCountRequest.class, DeleteAclRuleCountResponse.class)
                .withName("DeleteAclRuleCount")
                .withUri("/v1/{project_id}/acl-rule/count")
                .withContentType("application/json");

        // requests
        builder.<ClearAccessLogRuleHitCountsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClearAccessLogRuleHitCountsDto.class),
            f -> f.withMarshaller(DeleteAclRuleCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAclRuleCountResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse> deleteAddressItemUsingDelete =
        genFordeleteAddressItemUsingDelete();

    private static HttpRequestDef<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse> genFordeleteAddressItemUsingDelete() {
        // basic
        HttpRequestDef.Builder<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAddressItemUsingDeleteRequest.class,
                    DeleteAddressItemUsingDeleteResponse.class)
                .withName("DeleteAddressItemUsingDelete")
                .withUri("/v1/{project_id}/address-items/{item_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("item_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressItemUsingDeleteRequest::getItemId, (req, v) -> {
                req.setItemId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse> deleteAddressSetInfoUsingDelete =
        genFordeleteAddressSetInfoUsingDelete();

    private static HttpRequestDef<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse> genFordeleteAddressSetInfoUsingDelete() {
        // basic
        HttpRequestDef.Builder<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAddressSetInfoUsingDeleteRequest.class,
                    DeleteAddressSetInfoUsingDeleteResponse.class)
                .withName("DeleteAddressSetInfoUsingDelete")
                .withUri("/v1/{project_id}/address-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressSetInfoUsingDeleteRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse> deleteBlackWhiteListUsingDelete =
        genFordeleteBlackWhiteListUsingDelete();

    private static HttpRequestDef<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse> genFordeleteBlackWhiteListUsingDelete() {
        // basic
        HttpRequestDef.Builder<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteBlackWhiteListUsingDeleteRequest.class,
                    DeleteBlackWhiteListUsingDeleteResponse.class)
                .withName("DeleteBlackWhiteListUsingDelete")
                .withUri("/v1/{project_id}/black-white-list/{list_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("list_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlackWhiteListUsingDeleteRequest::getListId, (req, v) -> {
                req.setListId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse> deleteServiceItemUsingDelete =
        genFordeleteServiceItemUsingDelete();

    private static HttpRequestDef<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse> genFordeleteServiceItemUsingDelete() {
        // basic
        HttpRequestDef.Builder<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteServiceItemUsingDeleteRequest.class,
                    DeleteServiceItemUsingDeleteResponse.class)
                .withName("DeleteServiceItemUsingDelete")
                .withUri("/v1/{project_id}/service-items/{item_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("item_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceItemUsingDeleteRequest::getItemId, (req, v) -> {
                req.setItemId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse> deleteServiceSetUsingDelete =
        genFordeleteServiceSetUsingDelete();

    private static HttpRequestDef<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse> genFordeleteServiceSetUsingDelete() {
        // basic
        HttpRequestDef.Builder<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteServiceSetUsingDeleteRequest.class,
                    DeleteServiceSetUsingDeleteResponse.class)
                .withName("DeleteServiceSetUsingDelete")
                .withUri("/v1/{project_id}/service-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceSetUsingDeleteRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogs =
        genForlistAccessControlLogs();

    private static HttpRequestDef<ListAccessControlLogsRequest, ListAccessControlLogsResponse> genForlistAccessControlLogs() {
        // basic
        HttpRequestDef.Builder<ListAccessControlLogsRequest, ListAccessControlLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessControlLogsRequest.class, ListAccessControlLogsResponse.class)
            .withName("ListAccessControlLogs")
            .withUri("/v1/{project_id}/cfw/logs/access-control")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcPort, (req, v) -> {
                req.setSrcPort(v);
            }));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstIp, (req, v) -> {
                req.setDstIp(v);
            }));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstPort, (req, v) -> {
                req.setDstPort(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            }));
        builder.<Integer>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getNextDate, (req, v) -> {
                req.setNextDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListAccessControlLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccessControlLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse> listAddressItemsUsingGet =
        genForlistAddressItemsUsingGet();

    private static HttpRequestDef<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse> genForlistAddressItemsUsingGet() {
        // basic
        HttpRequestDef.Builder<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAddressItemsUsingGetRequest.class, ListAddressItemsUsingGetResponse.class)
                .withName("ListAddressItemsUsingGet")
                .withUri("/v1/{project_id}/address-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsUsingGetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsUsingGetRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsUsingGetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsUsingGetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsUsingGetRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse> listAddressSetDetailUsingGet =
        genForlistAddressSetDetailUsingGet();

    private static HttpRequestDef<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse> genForlistAddressSetDetailUsingGet() {
        // basic
        HttpRequestDef.Builder<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAddressSetDetailUsingGetRequest.class,
                    ListAddressSetDetailUsingGetResponse.class)
                .withName("ListAddressSetDetailUsingGet")
                .withUri("/v1/{project_id}/address-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetDetailUsingGetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse> listAddressSetListUsingGet =
        genForlistAddressSetListUsingGet();

    private static HttpRequestDef<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse> genForlistAddressSetListUsingGet() {
        // basic
        HttpRequestDef.Builder<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAddressSetListUsingGetRequest.class,
                    ListAddressSetListUsingGetResponse.class)
                .withName("ListAddressSetListUsingGet")
                .withUri("/v1/{project_id}/address-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetListUsingGetRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetListUsingGetRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetListUsingGetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetListUsingGetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetListUsingGetRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<ListAddressSetListUsingGetRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAddressSetListUsingGetRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListAddressSetListUsingGetRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogs =
        genForlistAttackLogs();

    private static HttpRequestDef<ListAttackLogsRequest, ListAttackLogsResponse> genForlistAttackLogs() {
        // basic
        HttpRequestDef.Builder<ListAttackLogsRequest, ListAttackLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttackLogsRequest.class, ListAttackLogsResponse.class)
                .withName("ListAttackLogs")
                .withUri("/v1/{project_id}/cfw/logs/attack")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcPort, (req, v) -> {
                req.setSrcPort(v);
            }));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstIp, (req, v) -> {
                req.setDstIp(v);
            }));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstPort, (req, v) -> {
                req.setDstPort(v);
            }));
        builder.<ListAttackLogsRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            }));
        builder.<Long>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getNextDate, (req, v) -> {
                req.setNextDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<ListAttackLogsRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.ActionEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<ListAttackLogsRequest.DirectionEnum>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.DirectionEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<String>withRequestField("attack_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackType, (req, v) -> {
                req.setAttackType(v);
            }));
        builder.<String>withRequestField("attack_rule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackRule, (req, v) -> {
                req.setAttackRule(v);
            }));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            }));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSource, (req, v) -> {
                req.setSource(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse> listBlackWhiteListsUsingGet =
        genForlistBlackWhiteListsUsingGet();

    private static HttpRequestDef<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse> genForlistBlackWhiteListsUsingGet() {
        // basic
        HttpRequestDef.Builder<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBlackWhiteListsUsingGetRequest.class,
                    ListBlackWhiteListsUsingGetResponse.class)
                .withName("ListBlackWhiteListsUsingGet")
                .withUri("/v1/{project_id}/black-white-lists")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<ListBlackWhiteListsUsingGetRequest.ListTypeEnum>withRequestField("list_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBlackWhiteListsUsingGetRequest.ListTypeEnum.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getListType, (req, v) -> {
                req.setListType(v);
            }));
        builder.<ListBlackWhiteListsUsingGetRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBlackWhiteListsUsingGetRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<String>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getPort, (req, v) -> {
                req.setPort(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsUsingGetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDnsServersRequest, ListDnsServersResponse> listDnsServers =
        genForlistDnsServers();

    private static HttpRequestDef<ListDnsServersRequest, ListDnsServersResponse> genForlistDnsServers() {
        // basic
        HttpRequestDef.Builder<ListDnsServersRequest, ListDnsServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDnsServersRequest.class, ListDnsServersResponse.class)
                .withName("ListDnsServers")
                .withUri("/v1/{project_id}/dns/servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDnsServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDnsServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewall =
        genForlistEastWestFirewall();

    private static HttpRequestDef<ListEastWestFirewallRequest, ListEastWestFirewallResponse> genForlistEastWestFirewall() {
        // basic
        HttpRequestDef.Builder<ListEastWestFirewallRequest, ListEastWestFirewallResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEastWestFirewallRequest.class, ListEastWestFirewallResponse.class)
            .withName("ListEastWestFirewall")
            .withUri("/v1/{project_id}/firewall/east-west")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse> listFirewallUsingGet =
        genForlistFirewallUsingGet();

    private static HttpRequestDef<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse> genForlistFirewallUsingGet() {
        // basic
        HttpRequestDef.Builder<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFirewallUsingGetRequest.class, ListFirewallUsingGetResponse.class)
            .withName("ListFirewallUsingGet")
            .withUri("/v1/{project_id}/firewall/exist")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallUsingGetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallUsingGetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListFirewallUsingGetRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFirewallUsingGetRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListFirewallUsingGetRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForlistFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForlistFlowLogs() {
        // basic
        HttpRequestDef.Builder<ListFlowLogsRequest, ListFlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlowLogsRequest.class, ListFlowLogsResponse.class)
                .withName("ListFlowLogs")
                .withUri("/v1/{project_id}/cfw/logs/flow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<ListFlowLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcPort, (req, v) -> {
                req.setSrcPort(v);
            }));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstIp, (req, v) -> {
                req.setDstIp(v);
            }));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstPort, (req, v) -> {
                req.setDstPort(v);
            }));
        builder.<ListFlowLogsRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            }));
        builder.<Long>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getNextDate, (req, v) -> {
                req.setNextDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse> listIpsProtectModeUsingPost =
        genForlistIpsProtectModeUsingPost();

    private static HttpRequestDef<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse> genForlistIpsProtectModeUsingPost() {
        // basic
        HttpRequestDef.Builder<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIpsProtectModeUsingPostRequest.class,
                    ListIpsProtectModeUsingPostResponse.class)
                .withName("ListIpsProtectModeUsingPost")
                .withUri("/v1/{project_id}/ips/protect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsProtectModeUsingPostRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse> listParseDomainDetails =
        genForlistParseDomainDetails();

    private static HttpRequestDef<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse> genForlistParseDomainDetails() {
        // basic
        HttpRequestDef.Builder<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListParseDomainDetailsRequest.class, ListParseDomainDetailsResponse.class)
            .withName("ListParseDomainDetails")
            .withUri("/v1/{project_id}/domain/parse/{domain_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListParseDomainDetailsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleHitCountRequest, ListRuleHitCountResponse> listRuleHitCount =
        genForlistRuleHitCount();

    private static HttpRequestDef<ListRuleHitCountRequest, ListRuleHitCountResponse> genForlistRuleHitCount() {
        // basic
        HttpRequestDef.Builder<ListRuleHitCountRequest, ListRuleHitCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRuleHitCountRequest.class, ListRuleHitCountResponse.class)
                .withName("ListRuleHitCount")
                .withUri("/v1/{project_id}/acl-rule/count")
                .withContentType("application/json");

        // requests
        builder.<ListRuleHitCountDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleHitCountDto.class),
            f -> f.withMarshaller(ListRuleHitCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse> listServiceItemsDetails =
        genForlistServiceItemsDetails();

    private static HttpRequestDef<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse> genForlistServiceItemsDetails() {
        // basic
        HttpRequestDef.Builder<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServiceItemsDetailsRequest.class, ListServiceItemsDetailsResponse.class)
            .withName("ListServiceItemsDetails")
            .withUri("/v1/{project_id}/service-items")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsDetailsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsDetailsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceSetRequest, ListServiceSetResponse> listServiceSet =
        genForlistServiceSet();

    private static HttpRequestDef<ListServiceSetRequest, ListServiceSetResponse> genForlistServiceSet() {
        // basic
        HttpRequestDef.Builder<ListServiceSetRequest, ListServiceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceSetRequest.class, ListServiceSetResponse.class)
                .withName("ListServiceSet")
                .withUri("/v1/{project_id}/service-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse> listServiceSetDetails =
        genForlistServiceSetDetails();

    private static HttpRequestDef<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse> genForlistServiceSetDetails() {
        // basic
        HttpRequestDef.Builder<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServiceSetDetailsRequest.class, ListServiceSetDetailsResponse.class)
            .withName("ListServiceSetDetails")
            .withUri("/v1/{project_id}/service-sets/{set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetDetailsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse> updateAddressSetInfoUsingPut =
        genForupdateAddressSetInfoUsingPut();

    private static HttpRequestDef<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse> genForupdateAddressSetInfoUsingPut() {
        // basic
        HttpRequestDef.Builder<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAddressSetInfoUsingPutRequest.class,
                    UpdateAddressSetInfoUsingPutResponse.class)
                .withName("UpdateAddressSetInfoUsingPut")
                .withUri("/v1/{project_id}/address-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressSetInfoUsingPutRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<UpdateAddressSetDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAddressSetDto.class),
            f -> f.withMarshaller(UpdateAddressSetInfoUsingPutRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse> updateBlackWhiteListUsingPut =
        genForupdateBlackWhiteListUsingPut();

    private static HttpRequestDef<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse> genForupdateBlackWhiteListUsingPut() {
        // basic
        HttpRequestDef.Builder<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBlackWhiteListUsingPutRequest.class,
                    UpdateBlackWhiteListUsingPutResponse.class)
                .withName("UpdateBlackWhiteListUsingPut")
                .withUri("/v1/{project_id}/black-white-list/{list_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("list_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListUsingPutRequest::getListId, (req, v) -> {
                req.setListId(v);
            }));
        builder.<UpdateBlackWhiteListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBlackWhiteListDto.class),
            f -> f.withMarshaller(UpdateBlackWhiteListUsingPutRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServers =
        genForupdateDnsServers();

    private static HttpRequestDef<UpdateDnsServersRequest, UpdateDnsServersResponse> genForupdateDnsServers() {
        // basic
        HttpRequestDef.Builder<UpdateDnsServersRequest, UpdateDnsServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDnsServersRequest.class, UpdateDnsServersResponse.class)
                .withName("UpdateDnsServers")
                .withUri("/v1/{project_id}/dns/servers")
                .withContentType("application/json");

        // requests
        builder.<UpdateDnsServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDnsServersRequestBody.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse> updateServiceSetUsingPut =
        genForupdateServiceSetUsingPut();

    private static HttpRequestDef<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse> genForupdateServiceSetUsingPut() {
        // basic
        HttpRequestDef.Builder<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateServiceSetUsingPutRequest.class, UpdateServiceSetUsingPutResponse.class)
                .withName("UpdateServiceSetUsingPut")
                .withUri("/v1/{project_id}/service-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceSetUsingPutRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<UpdateServiceSetUsingPUTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServiceSetUsingPUTRequestBody.class),
            f -> f.withMarshaller(UpdateServiceSetUsingPutRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse> addRuleAclUsingPost =
        genForaddRuleAclUsingPost();

    private static HttpRequestDef<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse> genForaddRuleAclUsingPost() {
        // basic
        HttpRequestDef.Builder<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRuleAclUsingPostRequest.class, AddRuleAclUsingPostResponse.class)
                .withName("AddRuleAclUsingPost")
                .withUri("/v1/{project_id}/acl-rule")
                .withContentType("application/json");

        // requests
        builder.<AddRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRuleAclDto.class),
            f -> f.withMarshaller(AddRuleAclUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse> deleteRuleAclUsingDelete =
        genFordeleteRuleAclUsingDelete();

    private static HttpRequestDef<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse> genFordeleteRuleAclUsingDelete() {
        // basic
        HttpRequestDef.Builder<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRuleAclUsingDeleteRequest.class,
                    DeleteRuleAclUsingDeleteResponse.class)
                .withName("DeleteRuleAclUsingDelete")
                .withUri("/v1/{project_id}/acl-rule/{acl_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("acl_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleAclUsingDeleteRequest::getAclRuleId, (req, v) -> {
                req.setAclRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse> listRuleAclUsingPut =
        genForlistRuleAclUsingPut();

    private static HttpRequestDef<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse> genForlistRuleAclUsingPut() {
        // basic
        HttpRequestDef.Builder<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ListRuleAclUsingPutRequest.class, ListRuleAclUsingPutResponse.class)
                .withName("ListRuleAclUsingPut")
                .withUri("/v1/{project_id}/acl-rule/order/{acl_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("acl_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclUsingPutRequest::getAclRuleId, (req, v) -> {
                req.setAclRuleId(v);
            }));
        builder.<OrderRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderRuleAclDto.class),
            f -> f.withMarshaller(ListRuleAclUsingPutRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse> listRuleAclsUsingGet =
        genForlistRuleAclsUsingGet();

    private static HttpRequestDef<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse> genForlistRuleAclsUsingGet() {
        // basic
        HttpRequestDef.Builder<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRuleAclsUsingGetRequest.class, ListRuleAclsUsingGetResponse.class)
            .withName("ListRuleAclsUsingGet")
            .withUri("/v1/{project_id}/acl-rules")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<ListRuleAclsUsingGetRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleAclsUsingGetRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ListRuleAclsUsingGetRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleAclsUsingGetRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<ListRuleAclsUsingGetRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleAclsUsingGetRequest.StatusEnum.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListRuleAclsUsingGetRequest.ActionTypeEnum>withRequestField("action_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleAclsUsingGetRequest.ActionTypeEnum.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getActionType, (req, v) -> {
                req.setActionType(v);
            }));
        builder.<ListRuleAclsUsingGetRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleAclsUsingGetRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclsUsingGetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse> updateRuleAclUsingPut =
        genForupdateRuleAclUsingPut();

    private static HttpRequestDef<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse> genForupdateRuleAclUsingPut() {
        // basic
        HttpRequestDef.Builder<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRuleAclUsingPutRequest.class, UpdateRuleAclUsingPutResponse.class)
            .withName("UpdateRuleAclUsingPut")
            .withUri("/v1/{project_id}/acl-rule/{acl_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("acl_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleAclUsingPutRequest::getAclRuleId, (req, v) -> {
                req.setAclRuleId(v);
            }));
        builder.<UpdateRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleAclDto.class),
            f -> f.withMarshaller(UpdateRuleAclUsingPutRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeProtectEipRequest, ChangeProtectEipResponse> changeProtectEip =
        genForchangeProtectEip();

    private static HttpRequestDef<ChangeProtectEipRequest, ChangeProtectEipResponse> genForchangeProtectEip() {
        // basic
        HttpRequestDef.Builder<ChangeProtectEipRequest, ChangeProtectEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeProtectEipRequest.class, ChangeProtectEipResponse.class)
                .withName("ChangeProtectEip")
                .withUri("/v1/{project_id}/eip/protect")
                .withContentType("application/json");

        // requests
        builder.<EipOperateProtectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EipOperateProtectReq.class),
            f -> f.withMarshaller(ChangeProtectEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountEipsRequest, CountEipsResponse> countEips = genForcountEips();

    private static HttpRequestDef<CountEipsRequest, CountEipsResponse> genForcountEips() {
        // basic
        HttpRequestDef.Builder<CountEipsRequest, CountEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountEipsRequest.class, CountEipsResponse.class)
                .withName("CountEips")
                .withUri("/v1/{project_id}/eip-count/{object_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountEipsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipResourcesRequest, ListEipResourcesResponse> listEipResources =
        genForlistEipResources();

    private static HttpRequestDef<ListEipResourcesRequest, ListEipResourcesResponse> genForlistEipResources() {
        // basic
        HttpRequestDef.Builder<ListEipResourcesRequest, ListEipResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEipResourcesRequest.class, ListEipResourcesResponse.class)
                .withName("ListEipResources")
                .withUri("/v1/{project_id}/eips/protect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<ListEipResourcesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEipResourcesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListEipResourcesRequest.SyncEnum>withRequestField("sync",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEipResourcesRequest.SyncEnum.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getSync, (req, v) -> {
                req.setSync(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("device_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getDeviceKey, (req, v) -> {
                req.setDeviceKey(v);
            }));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipResourcesRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse> changeIpsSwitchUsingPost =
        genForchangeIpsSwitchUsingPost();

    private static HttpRequestDef<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse> genForchangeIpsSwitchUsingPost() {
        // basic
        HttpRequestDef.Builder<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ChangeIpsSwitchUsingPostRequest.class, ChangeIpsSwitchUsingPostResponse.class)
                .withName("ChangeIpsSwitchUsingPost")
                .withUri("/v1/{project_id}/ips/switch")
                .withContentType("application/json");

        // requests
        builder.<IpsSwitchDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsSwitchDTO.class),
            f -> f.withMarshaller(ChangeIpsSwitchUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse> listIpsSwitchStatusUsingGet =
        genForlistIpsSwitchStatusUsingGet();

    private static HttpRequestDef<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse> genForlistIpsSwitchStatusUsingGet() {
        // basic
        HttpRequestDef.Builder<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIpsSwitchStatusUsingGetRequest.class,
                    ListIpsSwitchStatusUsingGetResponse.class)
                .withName("ListIpsSwitchStatusUsingGet")
                .withUri("/v1/{project_id}/ips/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsSwitchStatusUsingGetRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcProtectsRequest, ListVpcProtectsResponse> listVpcProtects =
        genForlistVpcProtects();

    private static HttpRequestDef<ListVpcProtectsRequest, ListVpcProtectsResponse> genForlistVpcProtects() {
        // basic
        HttpRequestDef.Builder<ListVpcProtectsRequest, ListVpcProtectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcProtectsRequest.class, ListVpcProtectsResponse.class)
                .withName("ListVpcProtects")
                .withUri("/v1/{project_id}/vpcs/protection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcProtectsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));

        // response

        return builder.build();
    }

}
