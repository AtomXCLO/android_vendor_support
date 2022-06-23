package co.atomx.support.preference.indicator.animation.data.type;

import co.atomx.support.preference.indicator.animation.data.Value;

public class WormAnimationValue implements Value {

    private int rectStart;
    private int rectEnd;

    public int getRectStart() {
        return rectStart;
    }

    public void setRectStart(int rectStartEdge) {
        this.rectStart = rectStartEdge;
    }

    public int getRectEnd() {
        return rectEnd;
    }

    public void setRectEnd(int rectEnd) {
        this.rectEnd = rectEnd;
    }
}
