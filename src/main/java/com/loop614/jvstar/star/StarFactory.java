package com.loop614.jvstar.star;

import com.loop614.jvstar.star.domain.editor.StarEditor;
import com.loop614.jvstar.star.domain.editor.StarEditorImpl;
import com.loop614.jvstar.star.repository.StarRepository;
import org.springframework.stereotype.Component;

@Component
public class StarFactory {
    private final StarRepository starRepository;
    public StarFactory(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public StarRepository getStarRepository() {
        return this.starRepository;
    }

    public StarEditor createStarEditor() {
        return new StarEditorImpl(this.starRepository);
    }
}
