package com.mytube;

public class VideoEncoder implements Encodable {
  private Video video;

  public VideoEncoder(Video video) {
    this.video = video;
  }

  @Override
  public void encode(Video video) {
    System.out.println("Encoding video...");
    System.out.println("Done!\n");
  }
}
