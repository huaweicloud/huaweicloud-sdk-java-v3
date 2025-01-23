package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddTagResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddToCategoryRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddToCategoryResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchAddChildNodeRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchAddChildNodeResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutAndUpdateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutAndUpdateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateShareDocsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateShareDocsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteShareDocsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteShareDocsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteStructuredDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteStructuredDocumentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchRemoveChildNodeRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchRemoveChildNodeResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateDocumentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutAndUpdateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutAndUpdateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CollectHistoryDataRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CollectHistoryDataResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateDocumentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateMultiViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateMultiViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionMultiViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionMultiViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteMultiViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteMultiViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteTargetRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteTargetResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DisableDataInstanceRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DisableDataInstanceResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.EnableDataInstanceRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.EnableDataInstanceResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.GenerateBusinessCodeRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.GenerateBusinessCodeResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListBatchQueryRelatedObjectsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListBatchQueryRelatedObjectsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetAllParentListRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetAllParentListResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetChildListRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetChildListResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListHistoryDataRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListHistoryDataResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryDocumentsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryDocumentsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelatedObjectsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelatedObjectsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelationshipRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelationshipResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryShareDocsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryShareDocsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryTargetRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryTargetResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOBatchDeleteDocRequestDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOBatchOperateChildDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOCategoryDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOCompareVersionVO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVODeleteByConditionVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVODeleteDocParamDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOGenericLinkBatchQueryDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOGenericLinkQueryDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOGenericLinkTypeDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOGenericLinkTypeModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOGetTokenDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListBatchUpdateStructuredDocDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListMultiViewModelVersionViewCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveAllDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListShareDocsParamDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckInDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionReviseDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUndoCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOMongPageRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOMultiViewModelDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOMultiViewModelMasterIdModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOMultiViewModelVersionViewCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelSaveAsDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUniqueKeyDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryChildListDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryDocParamDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryParentDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestCountVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestSelectedVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestStaticsVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryShareDocs;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOStatisticsPVO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOStructuredDocInfo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOTagOperationDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOUpdateDocRequestDto;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelCompareVersionVO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelMasterIdsModifierDTO;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RefreshRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RefreshResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveFromCategoryRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveFromCategoryResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveTagResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetParentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetParentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetRootRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetRootResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetTokensRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetTokensResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowTagResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SwitchLifecycleTemplateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SwitchLifecycleTemplateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateDocumentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateStateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateStateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateViewResponse;

@SuppressWarnings("unchecked")
public class IDMEClassicAPIMeta {

    public static final HttpRequestDef<AddTagRequest, AddTagResponse> addTag = genForAddTag();

    private static HttpRequestDef<AddTagRequest, AddTagResponse> genForAddTag() {
        // basic
        HttpRequestDef.Builder<AddTagRequest, AddTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTagRequest.class, AddTagResponse.class)
                .withName("AddTag")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/addTag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTagRequest::getIdentifier, AddTagRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTagRequest::getModelName, AddTagRequest::setModelName));
        builder.<RDMParamVOTagOperationDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOTagOperationDTO.class),
            f -> f.withMarshaller(AddTagRequest::getBody, AddTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddToCategoryRequest, AddToCategoryResponse> addToCategory =
        genForAddToCategory();

    private static HttpRequestDef<AddToCategoryRequest, AddToCategoryResponse> genForAddToCategory() {
        // basic
        HttpRequestDef.Builder<AddToCategoryRequest, AddToCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddToCategoryRequest.class, AddToCategoryResponse.class)
                .withName("AddToCategory")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/addToCategory")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddToCategoryRequest::getIdentifier, AddToCategoryRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddToCategoryRequest::getModelName, AddToCategoryRequest::setModelName));
        builder.<RDMParamVOCategoryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOCategoryDTO.class),
            f -> f.withMarshaller(AddToCategoryRequest::getBody, AddToCategoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddChildNodeRequest, BatchAddChildNodeResponse> batchAddChildNode =
        genForBatchAddChildNode();

    private static HttpRequestDef<BatchAddChildNodeRequest, BatchAddChildNodeResponse> genForBatchAddChildNode() {
        // basic
        HttpRequestDef.Builder<BatchAddChildNodeRequest, BatchAddChildNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddChildNodeRequest.class, BatchAddChildNodeResponse.class)
                .withName("BatchAddChildNode")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchAddChildNode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddChildNodeRequest::getIdentifier, BatchAddChildNodeRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddChildNodeRequest::getModelName, BatchAddChildNodeRequest::setModelName));
        builder.<RDMParamVOBatchOperateChildDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOBatchOperateChildDTO.class),
            f -> f.withMarshaller(BatchAddChildNodeRequest::getBody, BatchAddChildNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckinRequest, BatchCheckinResponse> batchCheckin = genForBatchCheckin();

    private static HttpRequestDef<BatchCheckinRequest, BatchCheckinResponse> genForBatchCheckin() {
        // basic
        HttpRequestDef.Builder<BatchCheckinRequest, BatchCheckinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckinRequest.class, BatchCheckinResponse.class)
                .withName("BatchCheckin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckinRequest::getIdentifier, BatchCheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckinRequest::getModelName, BatchCheckinRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckInDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckInDTO.class),
            f -> f.withMarshaller(BatchCheckinRequest::getBody, BatchCheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutRequest, BatchCheckoutResponse> batchCheckout =
        genForBatchCheckout();

    private static HttpRequestDef<BatchCheckoutRequest, BatchCheckoutResponse> genForBatchCheckout() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutRequest, BatchCheckoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckoutRequest.class, BatchCheckoutResponse.class)
                .withName("BatchCheckout")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutRequest::getIdentifier, BatchCheckoutRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutRequest::getModelName, BatchCheckoutRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckOutDTO.class),
            f -> f.withMarshaller(BatchCheckoutRequest::getBody, BatchCheckoutRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> batchCheckoutAndUpdate =
        genForBatchCheckoutAndUpdate();

    private static HttpRequestDef<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> genForBatchCheckoutAndUpdate() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCheckoutAndUpdateRequest.class, BatchCheckoutAndUpdateResponse.class)
            .withName("BatchCheckoutAndUpdate")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckoutAndUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutAndUpdateRequest::getIdentifier,
                BatchCheckoutAndUpdateRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutAndUpdateRequest::getModelName,
                BatchCheckoutAndUpdateRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(BatchCheckoutAndUpdateRequest::getBody, BatchCheckoutAndUpdateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> batchCheckoutUndo =
        genForBatchCheckoutUndo();

    private static HttpRequestDef<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> genForBatchCheckoutUndo() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckoutUndoRequest.class, BatchCheckoutUndoResponse.class)
                .withName("BatchCheckoutUndo")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUndoCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoRequest::getIdentifier, BatchCheckoutUndoRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoRequest::getModelName, BatchCheckoutUndoRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(BatchCheckoutUndoRequest::getBody, BatchCheckoutUndoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> batchCheckoutUndoByAdmin =
        genForBatchCheckoutUndoByAdmin();

    private static HttpRequestDef<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> genForBatchCheckoutUndoByAdmin() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchCheckoutUndoByAdminRequest.class, BatchCheckoutUndoByAdminResponse.class)
                .withName("BatchCheckoutUndoByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUndoCheckoutByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoByAdminRequest::getIdentifier,
                BatchCheckoutUndoByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoByAdminRequest::getModelName,
                BatchCheckoutUndoByAdminRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(BatchCheckoutUndoByAdminRequest::getBody, BatchCheckoutUndoByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse> batchCreateShareDocs =
        genForBatchCreateShareDocs();

    private static HttpRequestDef<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse> genForBatchCreateShareDocs() {
        // basic
        HttpRequestDef.Builder<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateShareDocsRequest.class, BatchCreateShareDocsResponse.class)
            .withName("BatchCreateShareDocs")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/share-doc/batch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateShareDocsRequest::getModelName,
                BatchCreateShareDocsRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateShareDocsRequest::getIdentifier,
                BatchCreateShareDocsRequest::setIdentifier));
        builder.<RDMParamVOListShareDocsParamDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOListShareDocsParamDto.class),
            f -> f.withMarshaller(BatchCreateShareDocsRequest::getBody, BatchCreateShareDocsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPost =
        genForBatchCreateUsingPost();

    private static HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> genForBatchCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateUsingPostRequest.class, BatchCreateUsingPostResponse.class)
            .withName("BatchCreateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCreate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getIdentifier,
                BatchCreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getModelName,
                BatchCreateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelCreateDTO.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getBody, BatchCreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateViewRequest, BatchCreateViewResponse> batchCreateView =
        genForBatchCreateView();

    private static HttpRequestDef<BatchCreateViewRequest, BatchCreateViewResponse> genForBatchCreateView() {
        // basic
        HttpRequestDef.Builder<BatchCreateViewRequest, BatchCreateViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateViewRequest.class, BatchCreateViewResponse.class)
                .withName("BatchCreateView")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCreateView")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateViewRequest::getIdentifier, BatchCreateViewRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateViewRequest::getModelName, BatchCreateViewRequest::setModelName));
        builder.<RDMParamVOListMultiViewModelVersionViewCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListMultiViewModelVersionViewCreateDTO.class),
            f -> f.withMarshaller(BatchCreateViewRequest::getBody, BatchCreateViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranch =
        genForBatchDeleteBranch();

    private static HttpRequestDef<BatchDeleteBranchRequest, BatchDeleteBranchResponse> genForBatchDeleteBranch() {
        // basic
        HttpRequestDef.Builder<BatchDeleteBranchRequest, BatchDeleteBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteBranchRequest.class, BatchDeleteBranchResponse.class)
                .withName("BatchDeleteBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getIdentifier, BatchDeleteBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getModelName, BatchDeleteBranchRequest::setModelName));
        builder.<RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getBody, BatchDeleteBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse> batchDeleteLatestVersion =
        genForBatchDeleteLatestVersion();

    private static HttpRequestDef<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse> genForBatchDeleteLatestVersion() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteLatestVersionRequest.class, BatchDeleteLatestVersionResponse.class)
                .withName("BatchDeleteLatestVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batch-delete-latest-version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLatestVersionRequest::getModelName,
                BatchDeleteLatestVersionRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLatestVersionRequest::getIdentifier,
                BatchDeleteLatestVersionRequest::setIdentifier));
        builder.<RDMParamVOVersionModelMasterIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelMasterIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteLatestVersionRequest::getBody, BatchDeleteLatestVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> batchDeleteLogicalBranch =
        genForBatchDeleteLogicalBranch();

    private static HttpRequestDef<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> genForBatchDeleteLogicalBranch() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteLogicalBranchRequest.class, BatchDeleteLogicalBranchResponse.class)
                .withName("BatchDeleteLogicalBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalBranchRequest::getIdentifier,
                BatchDeleteLogicalBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalBranchRequest::getModelName,
                BatchDeleteLogicalBranchRequest::setModelName));
        builder.<RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalBranchRequest::getBody, BatchDeleteLogicalBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse> batchDeleteLogicalLatestVersion =
        genForBatchDeleteLogicalLatestVersion();

    private static HttpRequestDef<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse> genForBatchDeleteLogicalLatestVersion() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteLogicalLatestVersionRequest.class,
                    BatchDeleteLogicalLatestVersionResponse.class)
                .withName("BatchDeleteLogicalLatestVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batch-logical-delete-latest-version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalLatestVersionRequest::getModelName,
                BatchDeleteLogicalLatestVersionRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalLatestVersionRequest::getIdentifier,
                BatchDeleteLogicalLatestVersionRequest::setIdentifier));
        builder.<RDMParamVOVersionModelMasterIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelMasterIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalLatestVersionRequest::getBody,
                BatchDeleteLogicalLatestVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPost =
        genForBatchDeleteLogicalUsingPost();

    private static HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> genForBatchDeleteLogicalUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteLogicalUsingPostRequest.class,
                    BatchDeleteLogicalUsingPostResponse.class)
                .withName("BatchDeleteLogicalUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getIdentifier,
                BatchDeleteLogicalUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getModelName,
                BatchDeleteLogicalUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getBody,
                BatchDeleteLogicalUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse> batchDeleteShareDocs =
        genForBatchDeleteShareDocs();

    private static HttpRequestDef<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse> genForBatchDeleteShareDocs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteShareDocsRequest.class, BatchDeleteShareDocsResponse.class)
            .withName("BatchDeleteShareDocs")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/share-doc/batch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteShareDocsRequest::getModelName,
                BatchDeleteShareDocsRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteShareDocsRequest::getIdentifier,
                BatchDeleteShareDocsRequest::setIdentifier));
        builder.<RDMParamVODeleteDocParamDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVODeleteDocParamDto.class),
            f -> f.withMarshaller(BatchDeleteShareDocsRequest::getBody, BatchDeleteShareDocsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse> batchDeleteStructuredDocument =
        genForBatchDeleteStructuredDocument();

    private static HttpRequestDef<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse> genForBatchDeleteStructuredDocument() {
        // basic
        HttpRequestDef.Builder<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteStructuredDocumentRequest.class,
                    BatchDeleteStructuredDocumentResponse.class)
                .withName("BatchDeleteStructuredDocument")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/documents/batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteStructuredDocumentRequest::getModelName,
                BatchDeleteStructuredDocumentRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteStructuredDocumentRequest::getIdentifier,
                BatchDeleteStructuredDocumentRequest::setIdentifier));
        builder.<RDMParamVOBatchDeleteDocRequestDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOBatchDeleteDocRequestDto.class),
            f -> f.withMarshaller(BatchDeleteStructuredDocumentRequest::getBody,
                BatchDeleteStructuredDocumentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPost =
        genForBatchDeleteUsingPost();

    private static HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> genForBatchDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteUsingPostRequest.class, BatchDeleteUsingPostResponse.class)
            .withName("BatchDeleteUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDelete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getIdentifier,
                BatchDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getModelName,
                BatchDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getBody, BatchDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchExecuteReviseRequest, BatchExecuteReviseResponse> batchExecuteRevise =
        genForBatchExecuteRevise();

    private static HttpRequestDef<BatchExecuteReviseRequest, BatchExecuteReviseResponse> genForBatchExecuteRevise() {
        // basic
        HttpRequestDef.Builder<BatchExecuteReviseRequest, BatchExecuteReviseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchExecuteReviseRequest.class, BatchExecuteReviseResponse.class)
                .withName("BatchExecuteRevise")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchRevise")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteReviseRequest::getIdentifier, BatchExecuteReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteReviseRequest::getModelName, BatchExecuteReviseRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionReviseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionReviseDTO.class),
            f -> f.withMarshaller(BatchExecuteReviseRequest::getBody, BatchExecuteReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse> batchRemoveChildNode =
        genForBatchRemoveChildNode();

    private static HttpRequestDef<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse> genForBatchRemoveChildNode() {
        // basic
        HttpRequestDef.Builder<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchRemoveChildNodeRequest.class, BatchRemoveChildNodeResponse.class)
            .withName("BatchRemoveChildNode")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchRemoveChildNode")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveChildNodeRequest::getIdentifier,
                BatchRemoveChildNodeRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveChildNodeRequest::getModelName,
                BatchRemoveChildNodeRequest::setModelName));
        builder.<RDMParamVOBatchOperateChildDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOBatchOperateChildDTO.class),
            f -> f.withMarshaller(BatchRemoveChildNodeRequest::getBody, BatchRemoveChildNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPost =
        genForBatchShowGetUsingPost();

    private static HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> genForBatchShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchShowGetUsingPostRequest.class, BatchShowGetUsingPostResponse.class)
            .withName("BatchShowGetUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchGet")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getIdentifier,
                BatchShowGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getModelName,
                BatchShowGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsDecryptDTO.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getBody, BatchShowGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> batchUpdateAndCheckin =
        genForBatchUpdateAndCheckin();

    private static HttpRequestDef<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> genForBatchUpdateAndCheckin() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateAndCheckinRequest.class, BatchUpdateAndCheckinResponse.class)
            .withName("BatchUpdateAndCheckin")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateAndCheckin")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndCheckinRequest::getIdentifier,
                BatchUpdateAndCheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndCheckinRequest::getModelName,
                BatchUpdateAndCheckinRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel.class),
            f -> f.withMarshaller(BatchUpdateAndCheckinRequest::getBody, BatchUpdateAndCheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> batchUpdateAndRevise =
        genForBatchUpdateAndRevise();

    private static HttpRequestDef<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> genForBatchUpdateAndRevise() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateAndReviseRequest.class, BatchUpdateAndReviseResponse.class)
            .withName("BatchUpdateAndRevise")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchReviseAndUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndReviseRequest::getIdentifier,
                BatchUpdateAndReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndReviseRequest::getModelName,
                BatchUpdateAndReviseRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(BatchUpdateAndReviseRequest::getBody, BatchUpdateAndReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> batchUpdateByAdmin =
        genForBatchUpdateByAdmin();

    private static HttpRequestDef<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> genForBatchUpdateByAdmin() {
        // basic
        HttpRequestDef.Builder<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateByAdminRequest.class, BatchUpdateByAdminResponse.class)
                .withName("BatchUpdateByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateByAdminRequest::getIdentifier, BatchUpdateByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateByAdminRequest::getModelName, BatchUpdateByAdminRequest::setModelName));
        builder.<RDMParamVOListVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModel.class),
            f -> f.withMarshaller(BatchUpdateByAdminRequest::getBody, BatchUpdateByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse> batchUpdateDocument =
        genForBatchUpdateDocument();

    private static HttpRequestDef<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse> genForBatchUpdateDocument() {
        // basic
        HttpRequestDef.Builder<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateDocumentRequest.class, BatchUpdateDocumentResponse.class)
                .withName("BatchUpdateDocument")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/documents/batch/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateDocumentRequest::getModelName, BatchUpdateDocumentRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateDocumentRequest::getIdentifier,
                BatchUpdateDocumentRequest::setIdentifier));
        builder.<RDMParamVOListBatchUpdateStructuredDocDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOListBatchUpdateStructuredDocDto.class),
            f -> f.withMarshaller(BatchUpdateDocumentRequest::getBody, BatchUpdateDocumentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPost =
        genForBatchUpdateUsingPost();

    private static HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> genForBatchUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateUsingPostRequest.class, BatchUpdateUsingPostResponse.class)
            .withName("BatchUpdateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getIdentifier,
                BatchUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getModelName,
                BatchUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getBody, BatchUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateVersionRequest, BatchUpdateVersionResponse> batchUpdateVersion =
        genForBatchUpdateVersion();

    private static HttpRequestDef<BatchUpdateVersionRequest, BatchUpdateVersionResponse> genForBatchUpdateVersion() {
        // basic
        HttpRequestDef.Builder<BatchUpdateVersionRequest, BatchUpdateVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateVersionRequest.class, BatchUpdateVersionResponse.class)
                .withName("BatchUpdateVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateVersionRequest::getIdentifier, BatchUpdateVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateVersionRequest::getModelName, BatchUpdateVersionRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUpdateDTO.class),
            f -> f.withMarshaller(BatchUpdateVersionRequest::getBody, BatchUpdateVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckinRequest, CheckinResponse> checkin = genForCheckin();

    private static HttpRequestDef<CheckinRequest, CheckinResponse> genForCheckin() {
        // basic
        HttpRequestDef.Builder<CheckinRequest, CheckinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckinRequest.class, CheckinResponse.class)
                .withName("Checkin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckinRequest::getIdentifier, CheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckinRequest::getModelName, CheckinRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckInDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckInDTO.class),
            f -> f.withMarshaller(CheckinRequest::getBody, CheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutRequest, CheckoutResponse> checkout = genForCheckout();

    private static HttpRequestDef<CheckoutRequest, CheckoutResponse> genForCheckout() {
        // basic
        HttpRequestDef.Builder<CheckoutRequest, CheckoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutRequest.class, CheckoutResponse.class)
                .withName("Checkout")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutRequest::getIdentifier, CheckoutRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutRequest::getModelName, CheckoutRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckOutDTO.class),
            f -> f.withMarshaller(CheckoutRequest::getBody, CheckoutRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> checkoutAndUpdate =
        genForCheckoutAndUpdate();

    private static HttpRequestDef<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> genForCheckoutAndUpdate() {
        // basic
        HttpRequestDef.Builder<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutAndUpdateRequest.class, CheckoutAndUpdateResponse.class)
                .withName("CheckoutAndUpdate")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkoutAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutAndUpdateRequest::getIdentifier, CheckoutAndUpdateRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutAndUpdateRequest::getModelName, CheckoutAndUpdateRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(CheckoutAndUpdateRequest::getBody, CheckoutAndUpdateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutUndoRequest, CheckoutUndoResponse> checkoutUndo = genForCheckoutUndo();

    private static HttpRequestDef<CheckoutUndoRequest, CheckoutUndoResponse> genForCheckoutUndo() {
        // basic
        HttpRequestDef.Builder<CheckoutUndoRequest, CheckoutUndoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutUndoRequest.class, CheckoutUndoResponse.class)
                .withName("CheckoutUndo")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/undoCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoRequest::getIdentifier, CheckoutUndoRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoRequest::getModelName, CheckoutUndoRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(CheckoutUndoRequest::getBody, CheckoutUndoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> checkoutUndoByAdmin =
        genForCheckoutUndoByAdmin();

    private static HttpRequestDef<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> genForCheckoutUndoByAdmin() {
        // basic
        HttpRequestDef.Builder<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutUndoByAdminRequest.class, CheckoutUndoByAdminResponse.class)
                .withName("CheckoutUndoByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/undoCheckoutByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoByAdminRequest::getIdentifier,
                CheckoutUndoByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoByAdminRequest::getModelName, CheckoutUndoByAdminRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(CheckoutUndoByAdminRequest::getBody, CheckoutUndoByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectHistoryDataRequest, CollectHistoryDataResponse> collectHistoryData =
        genForCollectHistoryData();

    private static HttpRequestDef<CollectHistoryDataRequest, CollectHistoryDataResponse> genForCollectHistoryData() {
        // basic
        HttpRequestDef.Builder<CollectHistoryDataRequest, CollectHistoryDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CollectHistoryDataRequest.class, CollectHistoryDataResponse.class)
                .withName("CollectHistoryData")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/statisticsHistoryData")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHistoryDataRequest::getIdentifier, CollectHistoryDataRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHistoryDataRequest::getModelName, CollectHistoryDataRequest::setModelName));
        builder.<RDMParamVOStatisticsPVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOStatisticsPVO.class),
            f -> f.withMarshaller(CollectHistoryDataRequest::getBody, CollectHistoryDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareBusinessVersionRequest, CompareBusinessVersionResponse> compareBusinessVersion =
        genForCompareBusinessVersion();

    private static HttpRequestDef<CompareBusinessVersionRequest, CompareBusinessVersionResponse> genForCompareBusinessVersion() {
        // basic
        HttpRequestDef.Builder<CompareBusinessVersionRequest, CompareBusinessVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CompareBusinessVersionRequest.class, CompareBusinessVersionResponse.class)
            .withName("CompareBusinessVersion")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/compareBusinessVersion")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareBusinessVersionRequest::getIdentifier,
                CompareBusinessVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareBusinessVersionRequest::getModelName,
                CompareBusinessVersionRequest::setModelName));
        builder.<RDMParamVOVersionModelCompareVersionVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelCompareVersionVO.class),
            f -> f.withMarshaller(CompareBusinessVersionRequest::getBody, CompareBusinessVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareVersionRequest, CompareVersionResponse> compareVersion =
        genForCompareVersion();

    private static HttpRequestDef<CompareVersionRequest, CompareVersionResponse> genForCompareVersion() {
        // basic
        HttpRequestDef.Builder<CompareVersionRequest, CompareVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareVersionRequest.class, CompareVersionResponse.class)
                .withName("CompareVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/compareVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareVersionRequest::getIdentifier, CompareVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareVersionRequest::getModelName, CompareVersionRequest::setModelName));
        builder.<RDMParamVOCompareVersionVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOCompareVersionVO.class),
            f -> f.withMarshaller(CompareVersionRequest::getBody, CompareVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> countUsingPost =
        genForCountUsingPost();

    private static HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> genForCountUsingPost() {
        // basic
        HttpRequestDef.Builder<CountUsingPostRequest, CountUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountUsingPostRequest.class, CountUsingPostResponse.class)
                .withName("CountUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getIdentifier, CountUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getModelName, CountUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestCountVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestCountVo.class),
            f -> f.withMarshaller(CountUsingPostRequest::getBody, CountUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocumentRequest, CreateDocumentResponse> createDocument =
        genForCreateDocument();

    private static HttpRequestDef<CreateDocumentRequest, CreateDocumentResponse> genForCreateDocument() {
        // basic
        HttpRequestDef.Builder<CreateDocumentRequest, CreateDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDocumentRequest.class, CreateDocumentResponse.class)
                .withName("CreateDocument")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/documents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDocumentRequest::getModelName, CreateDocumentRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDocumentRequest::getIdentifier, CreateDocumentRequest::setIdentifier));
        builder.<RDMParamVOStructuredDocInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOStructuredDocInfo.class),
            f -> f.withMarshaller(CreateDocumentRequest::getBody, CreateDocumentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMultiViewRequest, CreateMultiViewResponse> createMultiView =
        genForCreateMultiView();

    private static HttpRequestDef<CreateMultiViewRequest, CreateMultiViewResponse> genForCreateMultiView() {
        // basic
        HttpRequestDef.Builder<CreateMultiViewRequest, CreateMultiViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMultiViewRequest.class, CreateMultiViewResponse.class)
                .withName("CreateMultiView")
                .withUri("/rdm_{identifier}_app/publicservices/api/{mvModelName}/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mvModelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMultiViewRequest::getMvModelName, CreateMultiViewRequest::setMvModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMultiViewRequest::getIdentifier, CreateMultiViewRequest::setIdentifier));
        builder.<RDMParamVOMultiViewModelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOMultiViewModelDTO.class),
            f -> f.withMarshaller(CreateMultiViewRequest::getBody, CreateMultiViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPost =
        genForCreateUsingPost();

    private static HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> genForCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<CreateUsingPostRequest, CreateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUsingPostRequest.class, CreateUsingPostResponse.class)
                .withName("CreateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getIdentifier, CreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getModelName, CreateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelCreateDTO.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getBody, CreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateViewRequest, CreateViewResponse> createView = genForCreateView();

    private static HttpRequestDef<CreateViewRequest, CreateViewResponse> genForCreateView() {
        // basic
        HttpRequestDef.Builder<CreateViewRequest, CreateViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateViewRequest.class, CreateViewResponse.class)
                .withName("CreateView")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/createView")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateViewRequest::getIdentifier, CreateViewRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateViewRequest::getModelName, CreateViewRequest::setModelName));
        builder.<RDMParamVOMultiViewModelVersionViewCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOMultiViewModelVersionViewCreateDTO.class),
            f -> f.withMarshaller(CreateViewRequest::getBody, CreateViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBranchRequest, DeleteBranchResponse> deleteBranch = genForDeleteBranch();

    private static HttpRequestDef<DeleteBranchRequest, DeleteBranchResponse> genForDeleteBranch() {
        // basic
        HttpRequestDef.Builder<DeleteBranchRequest, DeleteBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteBranchRequest.class, DeleteBranchResponse.class)
                .withName("DeleteBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBranchRequest::getIdentifier, DeleteBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBranchRequest::getModelName, DeleteBranchRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteBranchRequest::getBody, DeleteBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse> deleteByConditionMultiView =
        genForDeleteByConditionMultiView();

    private static HttpRequestDef<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse> genForDeleteByConditionMultiView() {
        // basic
        HttpRequestDef.Builder<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteByConditionMultiViewRequest.class,
                    DeleteByConditionMultiViewResponse.class)
                .withName("DeleteByConditionMultiView")
                .withUri("/rdm_{identifier}_app/publicservices/api/{mvModelName}/deleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mvModelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionMultiViewRequest::getMvModelName,
                DeleteByConditionMultiViewRequest::setMvModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionMultiViewRequest::getIdentifier,
                DeleteByConditionMultiViewRequest::setIdentifier));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(DeleteByConditionMultiViewRequest::getBody,
                DeleteByConditionMultiViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPost =
        genForDeleteByConditionUsingPost();

    private static HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> genForDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteByConditionUsingPostRequest.class,
                    DeleteByConditionUsingPostResponse.class)
                .withName("DeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getIdentifier,
                DeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getModelName,
                DeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getBody,
                DeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLatestVersionRequest, DeleteLatestVersionResponse> deleteLatestVersion =
        genForDeleteLatestVersion();

    private static HttpRequestDef<DeleteLatestVersionRequest, DeleteLatestVersionResponse> genForDeleteLatestVersion() {
        // basic
        HttpRequestDef.Builder<DeleteLatestVersionRequest, DeleteLatestVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteLatestVersionRequest.class, DeleteLatestVersionResponse.class)
                .withName("DeleteLatestVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteLatestVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLatestVersionRequest::getIdentifier,
                DeleteLatestVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLatestVersionRequest::getModelName, DeleteLatestVersionRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteLatestVersionRequest::getBody, DeleteLatestVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> deleteLogicalBranch =
        genForDeleteLogicalBranch();

    private static HttpRequestDef<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> genForDeleteLogicalBranch() {
        // basic
        HttpRequestDef.Builder<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteLogicalBranchRequest.class, DeleteLogicalBranchResponse.class)
                .withName("DeleteLogicalBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalBranchRequest::getIdentifier,
                DeleteLogicalBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalBranchRequest::getModelName, DeleteLogicalBranchRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteLogicalBranchRequest::getBody, DeleteLogicalBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> deleteLogicalLatestVersion =
        genForDeleteLogicalLatestVersion();

    private static HttpRequestDef<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> genForDeleteLogicalLatestVersion() {
        // basic
        HttpRequestDef.Builder<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteLogicalLatestVersionRequest.class,
                    DeleteLogicalLatestVersionResponse.class)
                .withName("DeleteLogicalLatestVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteLatestVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalLatestVersionRequest::getIdentifier,
                DeleteLogicalLatestVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalLatestVersionRequest::getModelName,
                DeleteLogicalLatestVersionRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteLogicalLatestVersionRequest::getBody,
                DeleteLogicalLatestVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMultiViewRequest, DeleteMultiViewResponse> deleteMultiView =
        genForDeleteMultiView();

    private static HttpRequestDef<DeleteMultiViewRequest, DeleteMultiViewResponse> genForDeleteMultiView() {
        // basic
        HttpRequestDef.Builder<DeleteMultiViewRequest, DeleteMultiViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteMultiViewRequest.class, DeleteMultiViewResponse.class)
                .withName("DeleteMultiView")
                .withUri("/rdm_{identifier}_app/publicservices/api/{mvModelName}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mvModelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMultiViewRequest::getMvModelName, DeleteMultiViewRequest::setMvModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMultiViewRequest::getIdentifier, DeleteMultiViewRequest::setIdentifier));
        builder.<RDMParamVOMultiViewModelMasterIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOMultiViewModelMasterIdModifierDTO.class),
            f -> f.withMarshaller(DeleteMultiViewRequest::getBody, DeleteMultiViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTargetRequest, DeleteTargetResponse> deleteTarget = genForDeleteTarget();

    private static HttpRequestDef<DeleteTargetRequest, DeleteTargetResponse> genForDeleteTarget() {
        // basic
        HttpRequestDef.Builder<DeleteTargetRequest, DeleteTargetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTargetRequest.class, DeleteTargetResponse.class)
                .withName("DeleteTarget")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteTarget")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTargetRequest::getIdentifier, DeleteTargetRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTargetRequest::getModelName, DeleteTargetRequest::setModelName));
        builder.<RDMParamVOGenericLinkTypeModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOGenericLinkTypeModifierDTO.class),
            f -> f.withMarshaller(DeleteTargetRequest::getBody, DeleteTargetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPost =
        genForDeleteUsingPost();

    private static HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> genForDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteUsingPostRequest, DeleteUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteUsingPostRequest.class, DeleteUsingPostResponse.class)
                .withName("DeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getIdentifier, DeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getModelName, DeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getBody, DeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableDataInstanceRequest, DisableDataInstanceResponse> disableDataInstance =
        genForDisableDataInstance();

    private static HttpRequestDef<DisableDataInstanceRequest, DisableDataInstanceResponse> genForDisableDataInstance() {
        // basic
        HttpRequestDef.Builder<DisableDataInstanceRequest, DisableDataInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableDataInstanceRequest.class, DisableDataInstanceResponse.class)
                .withName("DisableDataInstance")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDataInstanceRequest::getIdentifier,
                DisableDataInstanceRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDataInstanceRequest::getModelName, DisableDataInstanceRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(DisableDataInstanceRequest::getBody, DisableDataInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDataInstanceRequest, EnableDataInstanceResponse> enableDataInstance =
        genForEnableDataInstance();

    private static HttpRequestDef<EnableDataInstanceRequest, EnableDataInstanceResponse> genForEnableDataInstance() {
        // basic
        HttpRequestDef.Builder<EnableDataInstanceRequest, EnableDataInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDataInstanceRequest.class, EnableDataInstanceResponse.class)
                .withName("EnableDataInstance")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataInstanceRequest::getIdentifier, EnableDataInstanceRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataInstanceRequest::getModelName, EnableDataInstanceRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(EnableDataInstanceRequest::getBody, EnableDataInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteReviseRequest, ExecuteReviseResponse> executeRevise =
        genForExecuteRevise();

    private static HttpRequestDef<ExecuteReviseRequest, ExecuteReviseResponse> genForExecuteRevise() {
        // basic
        HttpRequestDef.Builder<ExecuteReviseRequest, ExecuteReviseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteReviseRequest.class, ExecuteReviseResponse.class)
                .withName("ExecuteRevise")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/revise")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteReviseRequest::getIdentifier, ExecuteReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteReviseRequest::getModelName, ExecuteReviseRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionReviseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionReviseDTO.class),
            f -> f.withMarshaller(ExecuteReviseRequest::getBody, ExecuteReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse> generateBusinessCode =
        genForGenerateBusinessCode();

    private static HttpRequestDef<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse> genForGenerateBusinessCode() {
        // basic
        HttpRequestDef.Builder<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GenerateBusinessCodeRequest.class, GenerateBusinessCodeResponse.class)
            .withName("GenerateBusinessCode")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/generateBusinessCode")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateBusinessCodeRequest::getIdentifier,
                GenerateBusinessCodeRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateBusinessCodeRequest::getModelName,
                GenerateBusinessCodeRequest::setModelName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllVersionsRequest, ListAllVersionsResponse> listAllVersions =
        genForListAllVersions();

    private static HttpRequestDef<ListAllVersionsRequest, ListAllVersionsResponse> genForListAllVersions() {
        // basic
        HttpRequestDef.Builder<ListAllVersionsRequest, ListAllVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllVersionsRequest.class, ListAllVersionsResponse.class)
                .withName("ListAllVersions")
                .withUri(
                    "/rdm_{identifier}_app/publicservices/api/{modelName}/getAllVersions/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getPageSizePath, ListAllVersionsRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getCurPagePath, ListAllVersionsRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getIdentifier, ListAllVersionsRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getModelName, ListAllVersionsRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getCurPage, ListAllVersionsRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getEndIndex, ListAllVersionsRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getMaxPageSize, ListAllVersionsRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getPageSize, ListAllVersionsRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getStartIndex, ListAllVersionsRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getTotalPages, ListAllVersionsRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getTotalRows, ListAllVersionsRequest::setTotalRows));
        builder.<RDMParamVOVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getBody, ListAllVersionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse> listBatchQueryRelatedObjects =
        genForListBatchQueryRelatedObjects();

    private static HttpRequestDef<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse> genForListBatchQueryRelatedObjects() {
        // basic
        HttpRequestDef.Builder<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListBatchQueryRelatedObjectsRequest.class,
                    ListBatchQueryRelatedObjectsResponse.class)
                .withName("ListBatchQueryRelatedObjects")
                .withUri(
                    "/rdm_{identifier}_app/publicservices/api/{modelName}/batchQueryRelatedObjects/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getPageSizePath,
                ListBatchQueryRelatedObjectsRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getCurPagePath,
                ListBatchQueryRelatedObjectsRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getIdentifier,
                ListBatchQueryRelatedObjectsRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getModelName,
                ListBatchQueryRelatedObjectsRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getCurPage,
                ListBatchQueryRelatedObjectsRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getEndIndex,
                ListBatchQueryRelatedObjectsRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getMaxPageSize,
                ListBatchQueryRelatedObjectsRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getPageSize,
                ListBatchQueryRelatedObjectsRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getStartIndex,
                ListBatchQueryRelatedObjectsRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getTotalPages,
                ListBatchQueryRelatedObjectsRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getTotalRows,
                ListBatchQueryRelatedObjectsRequest::setTotalRows));
        builder.<RDMParamVOGenericLinkBatchQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOGenericLinkBatchQueryDTO.class),
            f -> f.withMarshaller(ListBatchQueryRelatedObjectsRequest::getBody,
                ListBatchQueryRelatedObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGetAllParentListRequest, ListGetAllParentListResponse> listGetAllParentList =
        genForListGetAllParentList();

    private static HttpRequestDef<ListGetAllParentListRequest, ListGetAllParentListResponse> genForListGetAllParentList() {
        // basic
        HttpRequestDef.Builder<ListGetAllParentListRequest, ListGetAllParentListResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListGetAllParentListRequest.class, ListGetAllParentListResponse.class)
            .withName("ListGetAllParentList")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/getAllParentList")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGetAllParentListRequest::getIdentifier,
                ListGetAllParentListRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGetAllParentListRequest::getModelName,
                ListGetAllParentListRequest::setModelName));
        builder.<RDMParamVOQueryParentDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryParentDTO.class),
            f -> f.withMarshaller(ListGetAllParentListRequest::getBody, ListGetAllParentListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGetChildListRequest, ListGetChildListResponse> listGetChildList =
        genForListGetChildList();

    private static HttpRequestDef<ListGetChildListRequest, ListGetChildListResponse> genForListGetChildList() {
        // basic
        HttpRequestDef.Builder<ListGetChildListRequest, ListGetChildListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListGetChildListRequest.class, ListGetChildListResponse.class)
                .withName("ListGetChildList")
                .withUri(
                    "/rdm_{identifier}_app/publicservices/api/{modelName}/getChildList/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getPageSizePath, ListGetChildListRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getCurPagePath, ListGetChildListRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGetChildListRequest::getIdentifier, ListGetChildListRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGetChildListRequest::getModelName, ListGetChildListRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getCurPage, ListGetChildListRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getEndIndex, ListGetChildListRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getMaxPageSize, ListGetChildListRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getPageSize, ListGetChildListRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getStartIndex, ListGetChildListRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getTotalPages, ListGetChildListRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGetChildListRequest::getTotalRows, ListGetChildListRequest::setTotalRows));
        builder.<RDMParamVOQueryChildListDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryChildListDTO.class),
            f -> f.withMarshaller(ListGetChildListRequest::getBody, ListGetChildListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryDataRequest, ListHistoryDataResponse> listHistoryData =
        genForListHistoryData();

    private static HttpRequestDef<ListHistoryDataRequest, ListHistoryDataResponse> genForListHistoryData() {
        // basic
        HttpRequestDef.Builder<ListHistoryDataRequest, ListHistoryDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListHistoryDataRequest.class, ListHistoryDataResponse.class)
            .withName("ListHistoryData")
            .withUri(
                "/rdm_{identifier}_app/publicservices/api/{modelName}/queryHistoryData/{pageSizePath}/{curPagePath}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getPageSizePath, ListHistoryDataRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getCurPagePath, ListHistoryDataRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getIdentifier, ListHistoryDataRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getModelName, ListHistoryDataRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getCurPage, ListHistoryDataRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getEndIndex, ListHistoryDataRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getMaxPageSize, ListHistoryDataRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getPageSize, ListHistoryDataRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getStartIndex, ListHistoryDataRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getTotalPages, ListHistoryDataRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getTotalRows, ListHistoryDataRequest::setTotalRows));
        builder.<RDMParamVOMongPageRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOMongPageRequest.class),
            f -> f.withMarshaller(ListHistoryDataRequest::getBody, ListHistoryDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryDocumentsRequest, ListQueryDocumentsResponse> listQueryDocuments =
        genForListQueryDocuments();

    private static HttpRequestDef<ListQueryDocumentsRequest, ListQueryDocumentsResponse> genForListQueryDocuments() {
        // basic
        HttpRequestDef.Builder<ListQueryDocumentsRequest, ListQueryDocumentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryDocumentsRequest.class, ListQueryDocumentsResponse.class)
                .withName("ListQueryDocuments")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/documents/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryDocumentsRequest::getModelName, ListQueryDocumentsRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryDocumentsRequest::getIdentifier, ListQueryDocumentsRequest::setIdentifier));
        builder.<RDMParamVOQueryDocParamDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOQueryDocParamDto.class),
            f -> f.withMarshaller(ListQueryDocumentsRequest::getBody, ListQueryDocumentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse> listQueryRelatedObjects =
        genForListQueryRelatedObjects();

    private static HttpRequestDef<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse> genForListQueryRelatedObjects() {
        // basic
        HttpRequestDef.Builder<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListQueryRelatedObjectsRequest.class, ListQueryRelatedObjectsResponse.class)
            .withName("ListQueryRelatedObjects")
            .withUri(
                "/rdm_{identifier}_app/publicservices/api/{modelName}/queryRelatedObjects/{pageSizePath}/{curPagePath}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getPageSizePath,
                ListQueryRelatedObjectsRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getCurPagePath,
                ListQueryRelatedObjectsRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getIdentifier,
                ListQueryRelatedObjectsRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getModelName,
                ListQueryRelatedObjectsRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getCurPage,
                ListQueryRelatedObjectsRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getEndIndex,
                ListQueryRelatedObjectsRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getMaxPageSize,
                ListQueryRelatedObjectsRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getPageSize,
                ListQueryRelatedObjectsRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getStartIndex,
                ListQueryRelatedObjectsRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getTotalPages,
                ListQueryRelatedObjectsRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getTotalRows,
                ListQueryRelatedObjectsRequest::setTotalRows));
        builder.<RDMParamVOGenericLinkQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOGenericLinkQueryDTO.class),
            f -> f.withMarshaller(ListQueryRelatedObjectsRequest::getBody, ListQueryRelatedObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryRelationshipRequest, ListQueryRelationshipResponse> listQueryRelationship =
        genForListQueryRelationship();

    private static HttpRequestDef<ListQueryRelationshipRequest, ListQueryRelationshipResponse> genForListQueryRelationship() {
        // basic
        HttpRequestDef.Builder<ListQueryRelationshipRequest, ListQueryRelationshipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListQueryRelationshipRequest.class, ListQueryRelationshipResponse.class)
            .withName("ListQueryRelationship")
            .withUri(
                "/rdm_{identifier}_app/publicservices/api/{modelName}/queryRelationship/{pageSizePath}/{curPagePath}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getPageSizePath,
                ListQueryRelationshipRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getCurPagePath,
                ListQueryRelationshipRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getIdentifier,
                ListQueryRelationshipRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getModelName,
                ListQueryRelationshipRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getCurPage, ListQueryRelationshipRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getEndIndex,
                ListQueryRelationshipRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getMaxPageSize,
                ListQueryRelationshipRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getPageSize,
                ListQueryRelationshipRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getStartIndex,
                ListQueryRelationshipRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getTotalPages,
                ListQueryRelationshipRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getTotalRows,
                ListQueryRelationshipRequest::setTotalRows));
        builder.<RDMParamVOGenericLinkQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOGenericLinkQueryDTO.class),
            f -> f.withMarshaller(ListQueryRelationshipRequest::getBody, ListQueryRelationshipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryShareDocsRequest, ListQueryShareDocsResponse> listQueryShareDocs =
        genForListQueryShareDocs();

    private static HttpRequestDef<ListQueryShareDocsRequest, ListQueryShareDocsResponse> genForListQueryShareDocs() {
        // basic
        HttpRequestDef.Builder<ListQueryShareDocsRequest, ListQueryShareDocsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryShareDocsRequest.class, ListQueryShareDocsResponse.class)
                .withName("ListQueryShareDocs")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/share-doc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryShareDocsRequest::getModelName, ListQueryShareDocsRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryShareDocsRequest::getIdentifier, ListQueryShareDocsRequest::setIdentifier));
        builder.<RDMParamVOQueryShareDocs>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOQueryShareDocs.class),
            f -> f.withMarshaller(ListQueryShareDocsRequest::getBody, ListQueryShareDocsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryTargetRequest, ListQueryTargetResponse> listQueryTarget =
        genForListQueryTarget();

    private static HttpRequestDef<ListQueryTargetRequest, ListQueryTargetResponse> genForListQueryTarget() {
        // basic
        HttpRequestDef.Builder<ListQueryTargetRequest, ListQueryTargetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryTargetRequest.class, ListQueryTargetResponse.class)
                .withName("ListQueryTarget")
                .withUri(
                    "/rdm_{identifier}_app/publicservices/api/{modelName}/queryTarget/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getPageSizePath, ListQueryTargetRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getCurPagePath, ListQueryTargetRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getIdentifier, ListQueryTargetRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getModelName, ListQueryTargetRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getCurPage, ListQueryTargetRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getEndIndex, ListQueryTargetRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getMaxPageSize, ListQueryTargetRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getPageSize, ListQueryTargetRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getStartIndex, ListQueryTargetRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getTotalPages, ListQueryTargetRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getTotalRows, ListQueryTargetRequest::setTotalRows));
        builder.<RDMParamVOGenericLinkTypeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOGenericLinkTypeDTO.class),
            f -> f.withMarshaller(ListQueryTargetRequest::getBody, ListQueryTargetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPost =
        genForListQueryUsingPost();

    private static HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> genForListQueryUsingPost() {
        // basic
        HttpRequestDef.Builder<ListQueryUsingPostRequest, ListQueryUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryUsingPostRequest.class, ListQueryUsingPostResponse.class)
                .withName("ListQueryUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/query/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSizePath,
                ListQueryUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPagePath,
                ListQueryUsingPostRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getIdentifier, ListQueryUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getModelName, ListQueryUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPage, ListQueryUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getEndIndex, ListQueryUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getMaxPageSize,
                ListQueryUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSize, ListQueryUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getStartIndex, ListQueryUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalPages, ListQueryUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalRows, ListQueryUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getBody, ListQueryUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPost =
        genForListSelectUsingPost();

    private static HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> genForListSelectUsingPost() {
        // basic
        HttpRequestDef.Builder<ListSelectUsingPostRequest, ListSelectUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSelectUsingPostRequest.class, ListSelectUsingPostResponse.class)
                .withName("ListSelectUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/select/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSizePath,
                ListSelectUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPagePath,
                ListSelectUsingPostRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getIdentifier,
                ListSelectUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getModelName, ListSelectUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPage, ListSelectUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getEndIndex, ListSelectUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getMaxPageSize,
                ListSelectUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSize, ListSelectUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getStartIndex,
                ListSelectUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalPages,
                ListSelectUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalRows, ListSelectUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestSelectedVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestSelectedVo.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getBody, ListSelectUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> listUsingPost =
        genForListUsingPost();

    private static HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> genForListUsingPost() {
        // basic
        HttpRequestDef.Builder<ListUsingPostRequest, ListUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUsingPostRequest.class, ListUsingPostResponse.class)
                .withName("ListUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/list/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSizePath, ListUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPagePath, ListUsingPostRequest::setCurPagePath));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getIdentifier, ListUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getModelName, ListUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPage, ListUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getEndIndex, ListUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getMaxPageSize, ListUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSize, ListUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getStartIndex, ListUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalPages, ListUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalRows, ListUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListUsingPostRequest::getBody, ListUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RefreshRequest, RefreshResponse> refresh = genForRefresh();

    private static HttpRequestDef<RefreshRequest, RefreshResponse> genForRefresh() {
        // basic
        HttpRequestDef.Builder<RefreshRequest, RefreshResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RefreshRequest.class, RefreshResponse.class)
                .withName("Refresh")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/refresh")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RefreshRequest::getIdentifier, RefreshRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RefreshRequest::getModelName, RefreshRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsDTO.class),
            f -> f.withMarshaller(RefreshRequest::getBody, RefreshRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveFromCategoryRequest, RemoveFromCategoryResponse> removeFromCategory =
        genForRemoveFromCategory();

    private static HttpRequestDef<RemoveFromCategoryRequest, RemoveFromCategoryResponse> genForRemoveFromCategory() {
        // basic
        HttpRequestDef.Builder<RemoveFromCategoryRequest, RemoveFromCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveFromCategoryRequest.class, RemoveFromCategoryResponse.class)
                .withName("RemoveFromCategory")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/removeFromCategory")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveFromCategoryRequest::getModelName, RemoveFromCategoryRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveFromCategoryRequest::getIdentifier, RemoveFromCategoryRequest::setIdentifier));
        builder.<RDMParamVOCategoryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOCategoryDTO.class),
            f -> f.withMarshaller(RemoveFromCategoryRequest::getBody, RemoveFromCategoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveTagRequest, RemoveTagResponse> removeTag = genForRemoveTag();

    private static HttpRequestDef<RemoveTagRequest, RemoveTagResponse> genForRemoveTag() {
        // basic
        HttpRequestDef.Builder<RemoveTagRequest, RemoveTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveTagRequest.class, RemoveTagResponse.class)
                .withName("RemoveTag")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/removeTag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveTagRequest::getIdentifier, RemoveTagRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveTagRequest::getModelName, RemoveTagRequest::setModelName));
        builder.<RDMParamVOTagOperationDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOTagOperationDTO.class),
            f -> f.withMarshaller(RemoveTagRequest::getBody, RemoveTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPost =
        genForSaveAllUsingPost();

    private static HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> genForSaveAllUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAllUsingPostRequest, SaveAllUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAllUsingPostRequest.class, SaveAllUsingPostResponse.class)
                .withName("SaveAllUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAll")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getIdentifier, SaveAllUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getModelName, SaveAllUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveAllDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveAllDTO.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getBody, SaveAllUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPost =
        genForSaveAsUsingPost();

    private static HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> genForSaveAsUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAsUsingPostRequest, SaveAsUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAsUsingPostRequest.class, SaveAsUsingPostResponse.class)
                .withName("SaveAsUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getIdentifier, SaveAsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getModelName, SaveAsUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelSaveAsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelSaveAsDTO.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getBody, SaveAsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPost =
        genForSaveUsingPost();

    private static HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> genForSaveUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveUsingPostRequest, SaveUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveUsingPostRequest.class, SaveUsingPostResponse.class)
                .withName("SaveUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getIdentifier, SaveUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getModelName, SaveUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveDTO.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getBody, SaveUsingPostRequest::setBody));

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

    public static final HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKey =
        genForShowGetByUniqueKey();

    private static HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> genForShowGetByUniqueKey() {
        // basic
        HttpRequestDef.Builder<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetByUniqueKeyRequest.class, ShowGetByUniqueKeyResponse.class)
                .withName("ShowGetByUniqueKey")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/{getUniqueFieldMethod}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getIdentifier, ShowGetByUniqueKeyRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getModelName, ShowGetByUniqueKeyRequest::setModelName));
        builder.<String>withRequestField("getUniqueFieldMethod",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getGetUniqueFieldMethod,
                ShowGetByUniqueKeyRequest::setGetUniqueFieldMethod));
        builder.<RDMParamVOPersistableModelUniqueKeyDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUniqueKeyDTO.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getBody, ShowGetByUniqueKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetParentRequest, ShowGetParentResponse> showGetParent =
        genForShowGetParent();

    private static HttpRequestDef<ShowGetParentRequest, ShowGetParentResponse> genForShowGetParent() {
        // basic
        HttpRequestDef.Builder<ShowGetParentRequest, ShowGetParentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetParentRequest.class, ShowGetParentResponse.class)
                .withName("ShowGetParent")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/getParent")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetParentRequest::getIdentifier, ShowGetParentRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetParentRequest::getModelName, ShowGetParentRequest::setModelName));
        builder.<RDMParamVOQueryParentDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryParentDTO.class),
            f -> f.withMarshaller(ShowGetParentRequest::getBody, ShowGetParentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetRootRequest, ShowGetRootResponse> showGetRoot = genForShowGetRoot();

    private static HttpRequestDef<ShowGetRootRequest, ShowGetRootResponse> genForShowGetRoot() {
        // basic
        HttpRequestDef.Builder<ShowGetRootRequest, ShowGetRootResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetRootRequest.class, ShowGetRootResponse.class)
                .withName("ShowGetRoot")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/getRoot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetRootRequest::getIdentifier, ShowGetRootRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetRootRequest::getModelName, ShowGetRootRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdDTO.class),
            f -> f.withMarshaller(ShowGetRootRequest::getBody, ShowGetRootRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetTokensRequest, ShowGetTokensResponse> showGetTokens =
        genForShowGetTokens();

    private static HttpRequestDef<ShowGetTokensRequest, ShowGetTokensResponse> genForShowGetTokens() {
        // basic
        HttpRequestDef.Builder<ShowGetTokensRequest, ShowGetTokensResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetTokensRequest.class, ShowGetTokensResponse.class)
                .withName("ShowGetTokens")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/tokens")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetTokensRequest::getIdentifier, ShowGetTokensRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetTokensRequest::getModelName, ShowGetTokensRequest::setModelName));
        builder.<RDMParamVOGetTokenDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOGetTokenDto.class),
            f -> f.withMarshaller(ShowGetTokensRequest::getBody, ShowGetTokensRequest::setBody));

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

    public static final HttpRequestDef<ShowTagRequest, ShowTagResponse> showTag = genForShowTag();

    private static HttpRequestDef<ShowTagRequest, ShowTagResponse> genForShowTag() {
        // basic
        HttpRequestDef.Builder<ShowTagRequest, ShowTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTagRequest.class, ShowTagResponse.class)
                .withName("ShowTag")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/queryTag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagRequest::getIdentifier, ShowTagRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagRequest::getModelName, ShowTagRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdDTO.class),
            f -> f.withMarshaller(ShowTagRequest::getBody, ShowTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionByMasterRequest, ShowVersionByMasterResponse> showVersionByMaster =
        genForShowVersionByMaster();

    private static HttpRequestDef<ShowVersionByMasterRequest, ShowVersionByMasterResponse> genForShowVersionByMaster() {
        // basic
        HttpRequestDef.Builder<ShowVersionByMasterRequest, ShowVersionByMasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowVersionByMasterRequest.class, ShowVersionByMasterResponse.class)
                .withName("ShowVersionByMaster")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/getVersionByMaster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionByMasterRequest::getIdentifier,
                ShowVersionByMasterRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionByMasterRequest::getModelName, ShowVersionByMasterRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterQueryDTO.class),
            f -> f.withMarshaller(ShowVersionByMasterRequest::getBody, ShowVersionByMasterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse> switchLifecycleTemplate =
        genForSwitchLifecycleTemplate();

    private static HttpRequestDef<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse> genForSwitchLifecycleTemplate() {
        // basic
        HttpRequestDef.Builder<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchLifecycleTemplateRequest.class, SwitchLifecycleTemplateResponse.class)
            .withName("SwitchLifecycleTemplate")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/switchLifecycleTemplate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchLifecycleTemplateRequest::getIdentifier,
                SwitchLifecycleTemplateRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchLifecycleTemplateRequest::getModelName,
                SwitchLifecycleTemplateRequest::setModelName));
        builder.<RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO.class),
            f -> f.withMarshaller(SwitchLifecycleTemplateRequest::getBody, SwitchLifecycleTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAndCheckinRequest, UpdateAndCheckinResponse> updateAndCheckin =
        genForUpdateAndCheckin();

    private static HttpRequestDef<UpdateAndCheckinRequest, UpdateAndCheckinResponse> genForUpdateAndCheckin() {
        // basic
        HttpRequestDef.Builder<UpdateAndCheckinRequest, UpdateAndCheckinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAndCheckinRequest.class, UpdateAndCheckinResponse.class)
                .withName("UpdateAndCheckin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateAndCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndCheckinRequest::getIdentifier, UpdateAndCheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndCheckinRequest::getModelName, UpdateAndCheckinRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel.class),
            f -> f.withMarshaller(UpdateAndCheckinRequest::getBody, UpdateAndCheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAndReviseRequest, UpdateAndReviseResponse> updateAndRevise =
        genForUpdateAndRevise();

    private static HttpRequestDef<UpdateAndReviseRequest, UpdateAndReviseResponse> genForUpdateAndRevise() {
        // basic
        HttpRequestDef.Builder<UpdateAndReviseRequest, UpdateAndReviseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAndReviseRequest.class, UpdateAndReviseResponse.class)
                .withName("UpdateAndRevise")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/reviseAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndReviseRequest::getIdentifier, UpdateAndReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndReviseRequest::getModelName, UpdateAndReviseRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(UpdateAndReviseRequest::getBody, UpdateAndReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateByAdminRequest, UpdateByAdminResponse> updateByAdmin =
        genForUpdateByAdmin();

    private static HttpRequestDef<UpdateByAdminRequest, UpdateByAdminResponse> genForUpdateByAdmin() {
        // basic
        HttpRequestDef.Builder<UpdateByAdminRequest, UpdateByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateByAdminRequest.class, UpdateByAdminResponse.class)
                .withName("UpdateByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByAdminRequest::getIdentifier, UpdateByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByAdminRequest::getModelName, UpdateByAdminRequest::setModelName));
        builder.<RDMParamVOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModel.class),
            f -> f.withMarshaller(UpdateByAdminRequest::getBody, UpdateByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPost =
        genForUpdateByConditionUsingPost();

    private static HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> genForUpdateByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateByConditionUsingPostRequest.class,
                    UpdateByConditionUsingPostResponse.class)
                .withName("UpdateByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getIdentifier,
                UpdateByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getModelName,
                UpdateByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getBody,
                UpdateByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDocumentRequest, UpdateDocumentResponse> updateDocument =
        genForUpdateDocument();

    private static HttpRequestDef<UpdateDocumentRequest, UpdateDocumentResponse> genForUpdateDocument() {
        // basic
        HttpRequestDef.Builder<UpdateDocumentRequest, UpdateDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDocumentRequest.class, UpdateDocumentResponse.class)
                .withName("UpdateDocument")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/structured-doc/documents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDocumentRequest::getModelName, UpdateDocumentRequest::setModelName));
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDocumentRequest::getIdentifier, UpdateDocumentRequest::setIdentifier));
        builder.<RDMParamVOUpdateDocRequestDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RDMParamVOUpdateDocRequestDto.class),
            f -> f.withMarshaller(UpdateDocumentRequest::getBody, UpdateDocumentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStateRequest, UpdateStateResponse> updateState = genForUpdateState();

    private static HttpRequestDef<UpdateStateRequest, UpdateStateResponse> genForUpdateState() {
        // basic
        HttpRequestDef.Builder<UpdateStateRequest, UpdateStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateStateRequest.class, UpdateStateResponse.class)
                .withName("UpdateState")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateState")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStateRequest::getIdentifier, UpdateStateRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStateRequest::getModelName, UpdateStateRequest::setModelName));
        builder.<RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO.class),
            f -> f.withMarshaller(UpdateStateRequest::getBody, UpdateStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPost =
        genForUpdateUsingPost();

    private static HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> genForUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateUsingPostRequest, UpdateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateUsingPostRequest.class, UpdateUsingPostResponse.class)
                .withName("UpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getIdentifier, UpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getModelName, UpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getBody, UpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateViewRequest, UpdateViewResponse> updateView = genForUpdateView();

    private static HttpRequestDef<UpdateViewRequest, UpdateViewResponse> genForUpdateView() {
        // basic
        HttpRequestDef.Builder<UpdateViewRequest, UpdateViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateViewRequest.class, UpdateViewResponse.class)
                .withName("UpdateView")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateView")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateViewRequest::getIdentifier, UpdateViewRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateViewRequest::getModelName, UpdateViewRequest::setModelName));
        builder.<RDMParamVOVersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO.class),
            f -> f.withMarshaller(UpdateViewRequest::getBody, UpdateViewRequest::setBody));

        // response

        return builder.build();
    }

}
