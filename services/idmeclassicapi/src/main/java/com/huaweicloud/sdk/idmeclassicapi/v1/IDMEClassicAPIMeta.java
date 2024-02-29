package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVODeleteByConditionVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveAllDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckInDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionReviseDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUndoCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelSaveAsDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUniqueKeyDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestCountVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestSelectedVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestStaticsVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelCompareVersionVO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionCheckInDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionMasterDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionMasterModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionMasterQueryDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionReviseDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionUndoCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateAndCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateAndCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCompareBusinessVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCompareBusinessVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteLatestVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteLatestVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetAllVersionsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetAllVersionsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetVersionByMasterUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetVersionByMasterUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteLatestVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteLatestVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateAndCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateAndCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateUsingPostResponse;

@SuppressWarnings("unchecked")
public class IDMEClassicAPIMeta {

    public static final HttpRequestDef<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse> showBatchCheckinUsingPost =
        genForShowBatchCheckinUsingPost();

    private static HttpRequestDef<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse> genForShowBatchCheckinUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchCheckinUsingPostRequest.class,
                    ShowBatchCheckinUsingPostResponse.class)
                .withName("ShowBatchCheckinUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCheckinUsingPostRequest::getIdentifier,
                ShowBatchCheckinUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCheckinUsingPostRequest::getModelName,
                ShowBatchCheckinUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckInDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckInDTO.class),
            f -> f.withMarshaller(ShowBatchCheckinUsingPostRequest::getBody,
                ShowBatchCheckinUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse> showBatchCheckoutAndUpdateUsingPost =
        genForShowBatchCheckoutAndUpdateUsingPost();

    private static HttpRequestDef<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse> genForShowBatchCheckoutAndUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchCheckoutAndUpdateUsingPostRequest.class,
                    ShowBatchCheckoutAndUpdateUsingPostResponse.class)
                .withName("ShowBatchCheckoutAndUpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckoutAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCheckoutAndUpdateUsingPostRequest::getIdentifier,
                ShowBatchCheckoutAndUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCheckoutAndUpdateUsingPostRequest::getModelName,
                ShowBatchCheckoutAndUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(ShowBatchCheckoutAndUpdateUsingPostRequest::getBody,
                ShowBatchCheckoutAndUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse> showBatchCheckoutUsingPost =
        genForShowBatchCheckoutUsingPost();

    private static HttpRequestDef<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse> genForShowBatchCheckoutUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchCheckoutUsingPostRequest.class,
                    ShowBatchCheckoutUsingPostResponse.class)
                .withName("ShowBatchCheckoutUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCheckoutUsingPostRequest::getIdentifier,
                ShowBatchCheckoutUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCheckoutUsingPostRequest::getModelName,
                ShowBatchCheckoutUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckOutDTO.class),
            f -> f.withMarshaller(ShowBatchCheckoutUsingPostRequest::getBody,
                ShowBatchCheckoutUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse> showBatchCreateUsingPost =
        genForShowBatchCreateUsingPost();

    private static HttpRequestDef<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse> genForShowBatchCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowBatchCreateUsingPostRequest.class, ShowBatchCreateUsingPostResponse.class)
                .withName("ShowBatchCreateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCreate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCreateUsingPostRequest::getIdentifier,
                ShowBatchCreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCreateUsingPostRequest::getModelName,
                ShowBatchCreateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelCreateDTO.class),
            f -> f.withMarshaller(ShowBatchCreateUsingPostRequest::getBody, ShowBatchCreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse> showBatchDeleteBranchUsingPost =
        genForShowBatchDeleteBranchUsingPost();

    private static HttpRequestDef<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse> genForShowBatchDeleteBranchUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchDeleteBranchUsingPostRequest.class,
                    ShowBatchDeleteBranchUsingPostResponse.class)
                .withName("ShowBatchDeleteBranchUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchDeleteBranchUsingPostRequest::getIdentifier,
                ShowBatchDeleteBranchUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchDeleteBranchUsingPostRequest::getModelName,
                ShowBatchDeleteBranchUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(ShowBatchDeleteBranchUsingPostRequest::getBody,
                ShowBatchDeleteBranchUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse> showBatchDeleteUsingPost =
        genForShowBatchDeleteUsingPost();

    private static HttpRequestDef<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse> genForShowBatchDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowBatchDeleteUsingPostRequest.class, ShowBatchDeleteUsingPostResponse.class)
                .withName("ShowBatchDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchDeleteUsingPostRequest::getIdentifier,
                ShowBatchDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchDeleteUsingPostRequest::getModelName,
                ShowBatchDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(ShowBatchDeleteUsingPostRequest::getBody, ShowBatchDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse> showBatchGetUsingPost =
        genForShowBatchGetUsingPost();

    private static HttpRequestDef<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse> genForShowBatchGetUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowBatchGetUsingPostRequest.class, ShowBatchGetUsingPostResponse.class)
            .withName("ShowBatchGetUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchGet")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchGetUsingPostRequest::getIdentifier,
                ShowBatchGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchGetUsingPostRequest::getModelName,
                ShowBatchGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsDecryptDTO.class),
            f -> f.withMarshaller(ShowBatchGetUsingPostRequest::getBody, ShowBatchGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse> showBatchLogicalDeleteBranchUsingPost =
        genForShowBatchLogicalDeleteBranchUsingPost();

    private static HttpRequestDef<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse> genForShowBatchLogicalDeleteBranchUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchLogicalDeleteBranchUsingPostRequest.class,
                    ShowBatchLogicalDeleteBranchUsingPostResponse.class)
                .withName("ShowBatchLogicalDeleteBranchUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogicalDeleteBranchUsingPostRequest::getIdentifier,
                ShowBatchLogicalDeleteBranchUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogicalDeleteBranchUsingPostRequest::getModelName,
                ShowBatchLogicalDeleteBranchUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(ShowBatchLogicalDeleteBranchUsingPostRequest::getBody,
                ShowBatchLogicalDeleteBranchUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse> showBatchLogicalDeleteUsingPost =
        genForShowBatchLogicalDeleteUsingPost();

    private static HttpRequestDef<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse> genForShowBatchLogicalDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchLogicalDeleteUsingPostRequest.class,
                    ShowBatchLogicalDeleteUsingPostResponse.class)
                .withName("ShowBatchLogicalDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogicalDeleteUsingPostRequest::getIdentifier,
                ShowBatchLogicalDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogicalDeleteUsingPostRequest::getModelName,
                ShowBatchLogicalDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(ShowBatchLogicalDeleteUsingPostRequest::getBody,
                ShowBatchLogicalDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse> showBatchReviseAndUpdateUsingPost =
        genForShowBatchReviseAndUpdateUsingPost();

    private static HttpRequestDef<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse> genForShowBatchReviseAndUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchReviseAndUpdateUsingPostRequest.class,
                    ShowBatchReviseAndUpdateUsingPostResponse.class)
                .withName("ShowBatchReviseAndUpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchReviseAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchReviseAndUpdateUsingPostRequest::getIdentifier,
                ShowBatchReviseAndUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchReviseAndUpdateUsingPostRequest::getModelName,
                ShowBatchReviseAndUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(ShowBatchReviseAndUpdateUsingPostRequest::getBody,
                ShowBatchReviseAndUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse> showBatchReviseUsingPost =
        genForShowBatchReviseUsingPost();

    private static HttpRequestDef<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse> genForShowBatchReviseUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowBatchReviseUsingPostRequest.class, ShowBatchReviseUsingPostResponse.class)
                .withName("ShowBatchReviseUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchRevise")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchReviseUsingPostRequest::getIdentifier,
                ShowBatchReviseUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchReviseUsingPostRequest::getModelName,
                ShowBatchReviseUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionReviseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionReviseDTO.class),
            f -> f.withMarshaller(ShowBatchReviseUsingPostRequest::getBody, ShowBatchReviseUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse> showBatchUndoCheckoutByAdminUsingPost =
        genForShowBatchUndoCheckoutByAdminUsingPost();

    private static HttpRequestDef<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse> genForShowBatchUndoCheckoutByAdminUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchUndoCheckoutByAdminUsingPostRequest.class,
                    ShowBatchUndoCheckoutByAdminUsingPostResponse.class)
                .withName("ShowBatchUndoCheckoutByAdminUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUndoCheckoutByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUndoCheckoutByAdminUsingPostRequest::getIdentifier,
                ShowBatchUndoCheckoutByAdminUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUndoCheckoutByAdminUsingPostRequest::getModelName,
                ShowBatchUndoCheckoutByAdminUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(ShowBatchUndoCheckoutByAdminUsingPostRequest::getBody,
                ShowBatchUndoCheckoutByAdminUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse> showBatchUndoCheckoutUsingPost =
        genForShowBatchUndoCheckoutUsingPost();

    private static HttpRequestDef<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse> genForShowBatchUndoCheckoutUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchUndoCheckoutUsingPostRequest.class,
                    ShowBatchUndoCheckoutUsingPostResponse.class)
                .withName("ShowBatchUndoCheckoutUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUndoCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUndoCheckoutUsingPostRequest::getIdentifier,
                ShowBatchUndoCheckoutUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUndoCheckoutUsingPostRequest::getModelName,
                ShowBatchUndoCheckoutUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(ShowBatchUndoCheckoutUsingPostRequest::getBody,
                ShowBatchUndoCheckoutUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse> showBatchUpdateAndCheckinUsingPost =
        genForShowBatchUpdateAndCheckinUsingPost();

    private static HttpRequestDef<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse> genForShowBatchUpdateAndCheckinUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchUpdateAndCheckinUsingPostRequest.class,
                    ShowBatchUpdateAndCheckinUsingPostResponse.class)
                .withName("ShowBatchUpdateAndCheckinUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateAndCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateAndCheckinUsingPostRequest::getIdentifier,
                ShowBatchUpdateAndCheckinUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateAndCheckinUsingPostRequest::getModelName,
                ShowBatchUpdateAndCheckinUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel.class),
            f -> f.withMarshaller(ShowBatchUpdateAndCheckinUsingPostRequest::getBody,
                ShowBatchUpdateAndCheckinUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse> showBatchUpdateByAdminUsingPost =
        genForShowBatchUpdateByAdminUsingPost();

    private static HttpRequestDef<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse> genForShowBatchUpdateByAdminUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchUpdateByAdminUsingPostRequest.class,
                    ShowBatchUpdateByAdminUsingPostResponse.class)
                .withName("ShowBatchUpdateByAdminUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateByAdminUsingPostRequest::getIdentifier,
                ShowBatchUpdateByAdminUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateByAdminUsingPostRequest::getModelName,
                ShowBatchUpdateByAdminUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModel.class),
            f -> f.withMarshaller(ShowBatchUpdateByAdminUsingPostRequest::getBody,
                ShowBatchUpdateByAdminUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse> showBatchUpdateUsingPost =
        genForShowBatchUpdateUsingPost();

    private static HttpRequestDef<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse> genForShowBatchUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowBatchUpdateUsingPostRequest.class, ShowBatchUpdateUsingPostResponse.class)
                .withName("ShowBatchUpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateUsingPostRequest::getIdentifier,
                ShowBatchUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateUsingPostRequest::getModelName,
                ShowBatchUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(ShowBatchUpdateUsingPostRequest::getBody, ShowBatchUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse> showBatchUpdateVersionUsingPost =
        genForShowBatchUpdateVersionUsingPost();

    private static HttpRequestDef<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse> genForShowBatchUpdateVersionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowBatchUpdateVersionUsingPostRequest.class,
                    ShowBatchUpdateVersionUsingPostResponse.class)
                .withName("ShowBatchUpdateVersionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateVersionUsingPostRequest::getIdentifier,
                ShowBatchUpdateVersionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchUpdateVersionUsingPostRequest::getModelName,
                ShowBatchUpdateVersionUsingPostRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUpdateDTO.class),
            f -> f.withMarshaller(ShowBatchUpdateVersionUsingPostRequest::getBody,
                ShowBatchUpdateVersionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse> showCheckinUsingPost =
        genForShowCheckinUsingPost();

    private static HttpRequestDef<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse> genForShowCheckinUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowCheckinUsingPostRequest.class, ShowCheckinUsingPostResponse.class)
            .withName("ShowCheckinUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkin")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckinUsingPostRequest::getIdentifier,
                ShowCheckinUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckinUsingPostRequest::getModelName,
                ShowCheckinUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckInDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckInDTO.class),
            f -> f.withMarshaller(ShowCheckinUsingPostRequest::getBody, ShowCheckinUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse> showCheckoutAndUpdateUsingPost =
        genForShowCheckoutAndUpdateUsingPost();

    private static HttpRequestDef<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse> genForShowCheckoutAndUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowCheckoutAndUpdateUsingPostRequest.class,
                    ShowCheckoutAndUpdateUsingPostResponse.class)
                .withName("ShowCheckoutAndUpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkoutAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckoutAndUpdateUsingPostRequest::getIdentifier,
                ShowCheckoutAndUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckoutAndUpdateUsingPostRequest::getModelName,
                ShowCheckoutAndUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(ShowCheckoutAndUpdateUsingPostRequest::getBody,
                ShowCheckoutAndUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse> showCheckoutUsingPost =
        genForShowCheckoutUsingPost();

    private static HttpRequestDef<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse> genForShowCheckoutUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowCheckoutUsingPostRequest.class, ShowCheckoutUsingPostResponse.class)
            .withName("ShowCheckoutUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkout")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckoutUsingPostRequest::getIdentifier,
                ShowCheckoutUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckoutUsingPostRequest::getModelName,
                ShowCheckoutUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckOutDTO.class),
            f -> f.withMarshaller(ShowCheckoutUsingPostRequest::getBody, ShowCheckoutUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse> showCompareBusinessVersionUsingPost =
        genForShowCompareBusinessVersionUsingPost();

    private static HttpRequestDef<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse> genForShowCompareBusinessVersionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowCompareBusinessVersionUsingPostRequest.class,
                    ShowCompareBusinessVersionUsingPostResponse.class)
                .withName("ShowCompareBusinessVersionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/compareBusinessVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompareBusinessVersionUsingPostRequest::getIdentifier,
                ShowCompareBusinessVersionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompareBusinessVersionUsingPostRequest::getModelName,
                ShowCompareBusinessVersionUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelCompareVersionVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelCompareVersionVO.class),
            f -> f.withMarshaller(ShowCompareBusinessVersionUsingPostRequest::getBody,
                ShowCompareBusinessVersionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCountUsingPostRequest, ShowCountUsingPostResponse> showCountUsingPost =
        genForShowCountUsingPost();

    private static HttpRequestDef<ShowCountUsingPostRequest, ShowCountUsingPostResponse> genForShowCountUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowCountUsingPostRequest, ShowCountUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCountUsingPostRequest.class, ShowCountUsingPostResponse.class)
                .withName("ShowCountUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCountUsingPostRequest::getIdentifier, ShowCountUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCountUsingPostRequest::getModelName, ShowCountUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestCountVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestCountVo.class),
            f -> f.withMarshaller(ShowCountUsingPostRequest::getBody, ShowCountUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse> showCreateUsingPost =
        genForShowCreateUsingPost();

    private static HttpRequestDef<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse> genForShowCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCreateUsingPostRequest.class, ShowCreateUsingPostResponse.class)
                .withName("ShowCreateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCreateUsingPostRequest::getIdentifier,
                ShowCreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCreateUsingPostRequest::getModelName, ShowCreateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelCreateDTO.class),
            f -> f.withMarshaller(ShowCreateUsingPostRequest::getBody, ShowCreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse> showDeleteBranchUsingPost =
        genForShowDeleteBranchUsingPost();

    private static HttpRequestDef<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse> genForShowDeleteBranchUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowDeleteBranchUsingPostRequest.class,
                    ShowDeleteBranchUsingPostResponse.class)
                .withName("ShowDeleteBranchUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteBranchUsingPostRequest::getIdentifier,
                ShowDeleteBranchUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteBranchUsingPostRequest::getModelName,
                ShowDeleteBranchUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(ShowDeleteBranchUsingPostRequest::getBody,
                ShowDeleteBranchUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse> showDeleteByConditionUsingPost =
        genForShowDeleteByConditionUsingPost();

    private static HttpRequestDef<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse> genForShowDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowDeleteByConditionUsingPostRequest.class,
                    ShowDeleteByConditionUsingPostResponse.class)
                .withName("ShowDeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteByConditionUsingPostRequest::getIdentifier,
                ShowDeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteByConditionUsingPostRequest::getModelName,
                ShowDeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(ShowDeleteByConditionUsingPostRequest::getBody,
                ShowDeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse> showDeleteLatestVersionUsingPost =
        genForShowDeleteLatestVersionUsingPost();

    private static HttpRequestDef<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse> genForShowDeleteLatestVersionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowDeleteLatestVersionUsingPostRequest.class,
                    ShowDeleteLatestVersionUsingPostResponse.class)
                .withName("ShowDeleteLatestVersionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteLatestVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteLatestVersionUsingPostRequest::getIdentifier,
                ShowDeleteLatestVersionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteLatestVersionUsingPostRequest::getModelName,
                ShowDeleteLatestVersionUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(ShowDeleteLatestVersionUsingPostRequest::getBody,
                ShowDeleteLatestVersionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse> showDeleteUsingPost =
        genForShowDeleteUsingPost();

    private static HttpRequestDef<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse> genForShowDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDeleteUsingPostRequest.class, ShowDeleteUsingPostResponse.class)
                .withName("ShowDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteUsingPostRequest::getIdentifier,
                ShowDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeleteUsingPostRequest::getModelName, ShowDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(ShowDeleteUsingPostRequest::getBody, ShowDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPost =
        genForShowFindUsingPost();

    private static HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> genForShowFindUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowFindUsingPostRequest, ShowFindUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFindUsingPostRequest.class, ShowFindUsingPostResponse.class)
                .withName("ShowFindUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/find/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getIdentifier, ShowFindUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getModelName, ShowFindUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSizePath,
                ShowFindUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPagePath, ShowFindUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPage, ShowFindUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getEndIndex, ShowFindUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getMaxPageSize, ShowFindUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSize, ShowFindUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getStartIndex, ShowFindUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalPages, ShowFindUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalRows, ShowFindUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getBody, ShowFindUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse> showGetAllVersionsUsingPost =
        genForShowGetAllVersionsUsingPost();

    private static HttpRequestDef<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse> genForShowGetAllVersionsUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowGetAllVersionsUsingPostRequest.class,
                    ShowGetAllVersionsUsingPostResponse.class)
                .withName("ShowGetAllVersionsUsingPost")
                .withUri(
                    "/rdm_{identifier}_app/publicservices/api/{modelName}/getAllVersions/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getIdentifier,
                ShowGetAllVersionsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getModelName,
                ShowGetAllVersionsUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getCurPagePath,
                ShowGetAllVersionsUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getPageSizePath,
                ShowGetAllVersionsUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getCurPage,
                ShowGetAllVersionsUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getEndIndex,
                ShowGetAllVersionsUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getMaxPageSize,
                ShowGetAllVersionsUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getPageSize,
                ShowGetAllVersionsUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getStartIndex,
                ShowGetAllVersionsUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getTotalPages,
                ShowGetAllVersionsUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getTotalRows,
                ShowGetAllVersionsUsingPostRequest::setTotalRows));
        builder.<RDMParamVOVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(ShowGetAllVersionsUsingPostRequest::getBody,
                ShowGetAllVersionsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse> showGetByUniqueKeyUsingPost =
        genForShowGetByUniqueKeyUsingPost();

    private static HttpRequestDef<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse> genForShowGetByUniqueKeyUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowGetByUniqueKeyUsingPostRequest.class,
                    ShowGetByUniqueKeyUsingPostResponse.class)
                .withName("ShowGetByUniqueKeyUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/{getUniqueFieldMethod}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyUsingPostRequest::getIdentifier,
                ShowGetByUniqueKeyUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyUsingPostRequest::getModelName,
                ShowGetByUniqueKeyUsingPostRequest::setModelName));
        builder.<String>withRequestField("getUniqueFieldMethod",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyUsingPostRequest::getGetUniqueFieldMethod,
                ShowGetByUniqueKeyUsingPostRequest::setGetUniqueFieldMethod));
        builder.<RDMParamVOPersistableModelUniqueKeyDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUniqueKeyDTO.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyUsingPostRequest::getBody,
                ShowGetByUniqueKeyUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPost =
        genForShowGetUsingPost();

    private static HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> genForShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetUsingPostRequest, ShowGetUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetUsingPostRequest.class, ShowGetUsingPostResponse.class)
                .withName("ShowGetUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getIdentifier, ShowGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getModelName, ShowGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdDecryptDTO.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getBody, ShowGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse> showGetVersionByMasterUsingPost =
        genForShowGetVersionByMasterUsingPost();

    private static HttpRequestDef<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse> genForShowGetVersionByMasterUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowGetVersionByMasterUsingPostRequest.class,
                    ShowGetVersionByMasterUsingPostResponse.class)
                .withName("ShowGetVersionByMasterUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/getVersionByMaster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetVersionByMasterUsingPostRequest::getIdentifier,
                ShowGetVersionByMasterUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetVersionByMasterUsingPostRequest::getModelName,
                ShowGetVersionByMasterUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterQueryDTO.class),
            f -> f.withMarshaller(ShowGetVersionByMasterUsingPostRequest::getBody,
                ShowGetVersionByMasterUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListUsingPostRequest, ShowListUsingPostResponse> showListUsingPost =
        genForShowListUsingPost();

    private static HttpRequestDef<ShowListUsingPostRequest, ShowListUsingPostResponse> genForShowListUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowListUsingPostRequest, ShowListUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowListUsingPostRequest.class, ShowListUsingPostResponse.class)
                .withName("ShowListUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/list/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getIdentifier, ShowListUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getModelName, ShowListUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getPageSizePath,
                ShowListUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getCurPagePath, ShowListUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getCurPage, ShowListUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getEndIndex, ShowListUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getMaxPageSize, ShowListUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getPageSize, ShowListUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getStartIndex, ShowListUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getTotalPages, ShowListUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getTotalRows, ShowListUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ShowListUsingPostRequest::getBody, ShowListUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse> showLogicalDeleteBranchUsingPost =
        genForShowLogicalDeleteBranchUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse> genForShowLogicalDeleteBranchUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteBranchUsingPostRequest.class,
                    ShowLogicalDeleteBranchUsingPostResponse.class)
                .withName("ShowLogicalDeleteBranchUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteBranchUsingPostRequest::getIdentifier,
                ShowLogicalDeleteBranchUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteBranchUsingPostRequest::getModelName,
                ShowLogicalDeleteBranchUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(ShowLogicalDeleteBranchUsingPostRequest::getBody,
                ShowLogicalDeleteBranchUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPost =
        genForShowLogicalDeleteByConditionUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> genForShowLogicalDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteByConditionUsingPostRequest.class,
                    ShowLogicalDeleteByConditionUsingPostResponse.class)
                .withName("ShowLogicalDeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getIdentifier,
                ShowLogicalDeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getModelName,
                ShowLogicalDeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getBody,
                ShowLogicalDeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse> showLogicalDeleteLatestVersionUsingPost =
        genForShowLogicalDeleteLatestVersionUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse> genForShowLogicalDeleteLatestVersionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteLatestVersionUsingPostRequest.class,
                    ShowLogicalDeleteLatestVersionUsingPostResponse.class)
                .withName("ShowLogicalDeleteLatestVersionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteLatestVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteLatestVersionUsingPostRequest::getIdentifier,
                ShowLogicalDeleteLatestVersionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteLatestVersionUsingPostRequest::getModelName,
                ShowLogicalDeleteLatestVersionUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(ShowLogicalDeleteLatestVersionUsingPostRequest::getBody,
                ShowLogicalDeleteLatestVersionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPost =
        genForShowLogicalDeleteUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> genForShowLogicalDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteUsingPostRequest.class,
                    ShowLogicalDeleteUsingPostResponse.class)
                .withName("ShowLogicalDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getIdentifier,
                ShowLogicalDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getModelName,
                ShowLogicalDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getBody,
                ShowLogicalDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse> showQueryUsingPost =
        genForShowQueryUsingPost();

    private static HttpRequestDef<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse> genForShowQueryUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowQueryUsingPostRequest.class, ShowQueryUsingPostResponse.class)
                .withName("ShowQueryUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/query/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getIdentifier, ShowQueryUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getModelName, ShowQueryUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getPageSizePath,
                ShowQueryUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getCurPagePath,
                ShowQueryUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getCurPage, ShowQueryUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getEndIndex, ShowQueryUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getMaxPageSize,
                ShowQueryUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getPageSize, ShowQueryUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getStartIndex, ShowQueryUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getTotalPages, ShowQueryUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getTotalRows, ShowQueryUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ShowQueryUsingPostRequest::getBody, ShowQueryUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse> showReviseAndUpdateUsingPost =
        genForShowReviseAndUpdateUsingPost();

    private static HttpRequestDef<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse> genForShowReviseAndUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowReviseAndUpdateUsingPostRequest.class,
                    ShowReviseAndUpdateUsingPostResponse.class)
                .withName("ShowReviseAndUpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/reviseAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReviseAndUpdateUsingPostRequest::getIdentifier,
                ShowReviseAndUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReviseAndUpdateUsingPostRequest::getModelName,
                ShowReviseAndUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(ShowReviseAndUpdateUsingPostRequest::getBody,
                ShowReviseAndUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse> showReviseUsingPost =
        genForShowReviseUsingPost();

    private static HttpRequestDef<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse> genForShowReviseUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowReviseUsingPostRequest.class, ShowReviseUsingPostResponse.class)
                .withName("ShowReviseUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/revise")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReviseUsingPostRequest::getIdentifier,
                ShowReviseUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReviseUsingPostRequest::getModelName, ShowReviseUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionReviseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionReviseDTO.class),
            f -> f.withMarshaller(ShowReviseUsingPostRequest::getBody, ShowReviseUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse> showSaveAllUsingPost =
        genForShowSaveAllUsingPost();

    private static HttpRequestDef<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse> genForShowSaveAllUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowSaveAllUsingPostRequest.class, ShowSaveAllUsingPostResponse.class)
            .withName("ShowSaveAllUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAll")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveAllUsingPostRequest::getIdentifier,
                ShowSaveAllUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveAllUsingPostRequest::getModelName,
                ShowSaveAllUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveAllDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveAllDTO.class),
            f -> f.withMarshaller(ShowSaveAllUsingPostRequest::getBody, ShowSaveAllUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse> showSaveAsUsingPost =
        genForShowSaveAsUsingPost();

    private static HttpRequestDef<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse> genForShowSaveAsUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSaveAsUsingPostRequest.class, ShowSaveAsUsingPostResponse.class)
                .withName("ShowSaveAsUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveAsUsingPostRequest::getIdentifier,
                ShowSaveAsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveAsUsingPostRequest::getModelName, ShowSaveAsUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelSaveAsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelSaveAsDTO.class),
            f -> f.withMarshaller(ShowSaveAsUsingPostRequest::getBody, ShowSaveAsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse> showSaveUsingPost =
        genForShowSaveUsingPost();

    private static HttpRequestDef<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse> genForShowSaveUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSaveUsingPostRequest.class, ShowSaveUsingPostResponse.class)
                .withName("ShowSaveUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveUsingPostRequest::getIdentifier, ShowSaveUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSaveUsingPostRequest::getModelName, ShowSaveUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveDTO.class),
            f -> f.withMarshaller(ShowSaveUsingPostRequest::getBody, ShowSaveUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse> showSelectUsingPost =
        genForShowSelectUsingPost();

    private static HttpRequestDef<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse> genForShowSelectUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSelectUsingPostRequest.class, ShowSelectUsingPostResponse.class)
                .withName("ShowSelectUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/select/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getIdentifier,
                ShowSelectUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getModelName, ShowSelectUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getPageSizePath,
                ShowSelectUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getCurPagePath,
                ShowSelectUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getCurPage, ShowSelectUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getEndIndex, ShowSelectUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getMaxPageSize,
                ShowSelectUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getPageSize, ShowSelectUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getStartIndex,
                ShowSelectUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getTotalPages,
                ShowSelectUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getTotalRows, ShowSelectUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestSelectedVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestSelectedVo.class),
            f -> f.withMarshaller(ShowSelectUsingPostRequest::getBody, ShowSelectUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPost =
        genForShowStaticsUsingPost();

    private static HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> genForShowStaticsUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowStaticsUsingPostRequest.class, ShowStaticsUsingPostResponse.class)
            .withName("ShowStaticsUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/statics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getIdentifier,
                ShowStaticsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getModelName,
                ShowStaticsUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestStaticsVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestStaticsVo.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getBody, ShowStaticsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse> showUndoCheckoutByAdminUsingPost =
        genForShowUndoCheckoutByAdminUsingPost();

    private static HttpRequestDef<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse> genForShowUndoCheckoutByAdminUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUndoCheckoutByAdminUsingPostRequest.class,
                    ShowUndoCheckoutByAdminUsingPostResponse.class)
                .withName("ShowUndoCheckoutByAdminUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/undoCheckoutByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUndoCheckoutByAdminUsingPostRequest::getIdentifier,
                ShowUndoCheckoutByAdminUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUndoCheckoutByAdminUsingPostRequest::getModelName,
                ShowUndoCheckoutByAdminUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(ShowUndoCheckoutByAdminUsingPostRequest::getBody,
                ShowUndoCheckoutByAdminUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse> showUndoCheckoutUsingPost =
        genForShowUndoCheckoutUsingPost();

    private static HttpRequestDef<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse> genForShowUndoCheckoutUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUndoCheckoutUsingPostRequest.class,
                    ShowUndoCheckoutUsingPostResponse.class)
                .withName("ShowUndoCheckoutUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/undoCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUndoCheckoutUsingPostRequest::getIdentifier,
                ShowUndoCheckoutUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUndoCheckoutUsingPostRequest::getModelName,
                ShowUndoCheckoutUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(ShowUndoCheckoutUsingPostRequest::getBody,
                ShowUndoCheckoutUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse> showUpdateAndCheckinUsingPost =
        genForShowUpdateAndCheckinUsingPost();

    private static HttpRequestDef<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse> genForShowUpdateAndCheckinUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUpdateAndCheckinUsingPostRequest.class,
                    ShowUpdateAndCheckinUsingPostResponse.class)
                .withName("ShowUpdateAndCheckinUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateAndCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateAndCheckinUsingPostRequest::getIdentifier,
                ShowUpdateAndCheckinUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateAndCheckinUsingPostRequest::getModelName,
                ShowUpdateAndCheckinUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel.class),
            f -> f.withMarshaller(ShowUpdateAndCheckinUsingPostRequest::getBody,
                ShowUpdateAndCheckinUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse> showUpdateByAdminUsingPost =
        genForShowUpdateByAdminUsingPost();

    private static HttpRequestDef<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse> genForShowUpdateByAdminUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUpdateByAdminUsingPostRequest.class,
                    ShowUpdateByAdminUsingPostResponse.class)
                .withName("ShowUpdateByAdminUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateByAdminUsingPostRequest::getIdentifier,
                ShowUpdateByAdminUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateByAdminUsingPostRequest::getModelName,
                ShowUpdateByAdminUsingPostRequest::setModelName));
        builder.<RDMParamVOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModel.class),
            f -> f.withMarshaller(ShowUpdateByAdminUsingPostRequest::getBody,
                ShowUpdateByAdminUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse> showUpdateByConditionUsingPost =
        genForShowUpdateByConditionUsingPost();

    private static HttpRequestDef<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse> genForShowUpdateByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUpdateByConditionUsingPostRequest.class,
                    ShowUpdateByConditionUsingPostResponse.class)
                .withName("ShowUpdateByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateByConditionUsingPostRequest::getIdentifier,
                ShowUpdateByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateByConditionUsingPostRequest::getModelName,
                ShowUpdateByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(ShowUpdateByConditionUsingPostRequest::getBody,
                ShowUpdateByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse> showUpdateUsingPost =
        genForShowUpdateUsingPost();

    private static HttpRequestDef<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse> genForShowUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowUpdateUsingPostRequest.class, ShowUpdateUsingPostResponse.class)
                .withName("ShowUpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateUsingPostRequest::getIdentifier,
                ShowUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateUsingPostRequest::getModelName, ShowUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(ShowUpdateUsingPostRequest::getBody, ShowUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

}
