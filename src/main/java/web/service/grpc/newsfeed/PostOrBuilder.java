// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newsfeed.proto

package web.service.grpc.newsfeed;

public interface PostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Post)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>int64 userId = 2;</code>
   */
  long getUserId();

  /**
   * <code>string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  java.util.List<web.service.grpc.newsfeed.Comment> 
      getCommentsList();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  web.service.grpc.newsfeed.Comment getComments(int index);
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  int getCommentsCount();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  java.util.List<? extends web.service.grpc.newsfeed.CommentOrBuilder> 
      getCommentsOrBuilderList();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  web.service.grpc.newsfeed.CommentOrBuilder getCommentsOrBuilder(
      int index);

  /**
   * <code>repeated string likes = 5;</code>
   */
  java.util.List<java.lang.String>
      getLikesList();
  /**
   * <code>repeated string likes = 5;</code>
   */
  int getLikesCount();
  /**
   * <code>repeated string likes = 5;</code>
   */
  java.lang.String getLikes(int index);
  /**
   * <code>repeated string likes = 5;</code>
   */
  com.google.protobuf.ByteString
      getLikesBytes(int index);

  /**
   * <code>repeated .Share shares = 6;</code>
   */
  java.util.List<web.service.grpc.newsfeed.Share> 
      getSharesList();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  web.service.grpc.newsfeed.Share getShares(int index);
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  int getSharesCount();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  java.util.List<? extends web.service.grpc.newsfeed.ShareOrBuilder> 
      getSharesOrBuilderList();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  web.service.grpc.newsfeed.ShareOrBuilder getSharesOrBuilder(
      int index);

  /**
   * <code>repeated string tags = 7;</code>
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 7;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 7;</code>
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 7;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>repeated string images = 8;</code>
   */
  java.util.List<java.lang.String>
      getImagesList();
  /**
   * <code>repeated string images = 8;</code>
   */
  int getImagesCount();
  /**
   * <code>repeated string images = 8;</code>
   */
  java.lang.String getImages(int index);
  /**
   * <code>repeated string images = 8;</code>
   */
  com.google.protobuf.ByteString
      getImagesBytes(int index);
}
