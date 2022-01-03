# MTCNN-Mosaic

MTCNN으로 얼굴을 detect하고 OpenCV를 이용하여 얼굴인식 후 모자이크 처리를 하는 프로젝트 입니다.

1. https://github.com/ipazc/mtcnn 여기서 git colon 한다.

2. clone한 폴더에 haarcascade_frontalface_alt2.xml 둔다. ('./MTCNN/mtcnn') 폴더
OpenCV의 face recognition은 https://www.youtube.com/watch?v=PmZ29Vta7Vc&t=2827s 를 보고 만들었다.

3. clone한 폴더에 올린 주피터노트북도 같이 둔다. (위와 같은 경로)

4. 이미지 파일은 정사각형으로 얼굴부분만 잘라서 학습시킨다. (images에 학습하고자 하는 얼굴을 폴더화 해서 넣으면 된다)

5. conf 조절 하면서 얼굴인식 진행한다. 

6. MTCNN에서 나온 좌표값으로 모자이크를 진행한다.

7. 모자이크는 바운딩 박스의 좌표값의 픽셀크기 조절로 진행한다.
